
$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/barcodeContext/list',
        datatype: "json",
        colModel: [

            { label: 'barcodeId', name: 'barcodeId',  width: 45,index: "barcodeId" ,key: true,hidden:true},
            { label: '产品名称', name: 'productName',  width: 45},
            { label: '产品的二维码图片路径', name: 'barcodeUrl', width: 75 },
            { label: '二维码扫码次数', name: 'barcodeCount', width: 75 },
            { label: '二维码批次', name: 'barcodePici', width: 75 },

            { label: '二维码状态', name: 'barcodeStatus', width: 60, formatter: function(value, options, row){
                    return value === 0 ?
                        '<span class="label label-danger">未鉴别</span>' : value === 1 ?
                            '<span class="label label-success">已鉴别</span>' :
                            '<span class="label label-danger">初始化</span>'

                }},

            { label: '二维码创建时间', name: 'barcodeCreatetime', width: 75 },


            // { label: '二维码图片', name: 'barcodeCount', width: 75 },
            { label: 'ip', name: 'barcodeIp', sortable: false, width: 75 },
            { label: '地址', name: 'barcodeAddress', width: 90 },
            { label: '二维码创建时间', name: 'barcodeCreatetime', width: 75 },
            {
                label: '操作', width: 160, align: 'center', sortable: false, formatter: function (value, col, barcode) {
                   return '<a class="btn btn-outline btn-primary"   href=" ' +barcode.barcodeUrl+'?attname=">下载</a>';
                }
            }
        ],
        viewrecords: true,
        height: 385,
        rowNum: 10,
        rowList : [10,30,50],
        rownumbers: true,
        rownumWidth: 25,
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page",
            rows:"limit",
            order: "order"
        },
        gridComplete:function(){
            //隐藏grid底部滚动条
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
        }
    });

});
var setting = {
    data: {
        simpleData: {
            enable: true,
            idKey: "deptId",
            pIdKey: "parentId",
            rootPId: -1
        },
        key: {
            url:"nourl"
        }
    }
};
var ztree;

var vm = new Vue({
    el:'#rrapp',
    data:{
        q:{
            productName: null,
            barcodePici:null
        },
        showList: true,
        title:null,
        productList:{},
        barcode:{
            barcodeId:null,
            needCount:null,
            sqRemarks:null,
            intCount:null,
            barcodeStatus:null,
            productName:null,
            barcodeUrl:null


        }
    },
    methods: {
        query: function () {
            vm.reload();
        },

        add: function(){
            vm.showList = false;
            vm.title = "新增";

            vm.barcode = {
                barcodeId:null,
                needCount:null,
                productId:null,
                barcodeStatus:null,
                productName:null
            };



            vm.getproduct();
        },

        lookDetail: function (rowId) { //第三步：定义编辑操作
            vm.detail = true;
            vm.title = "下载";
            $.get(baseURL + "sys/barcodeContext/dowload", function (r) {
                vm.productList = r.product;
                // vm.productList = r.product;
                  console.log(vm.boxList,r)
            });
        },

        printDetail: function (rowId) {
            openWindow({
                type: 2,
                title: '<i class="fa fa-print"></i>打印二维码',
                content: '/shop/orderPrint.html?orderId=' + rowId
            })
        },

        getproduct: function() {
            $.get(baseURL + "sys/product/prodcutlist", function (r) {
                vm.productList = r.product;
                console.log(vm.boxList,r)
            });

        },
        getproduct2: function() {
            $.get(baseURL + "sys/product/prodcutlist", function (r) {
                vm.barcode = r.product;
                console.log(vm.barcode,r)
                var name=v.product.productName;
                alert(name);
                $("#productName").html(name);
                alert("cg")
            });

        },
        dowload: function(barcodeId) {
            $.get(baseURL + "sys/barcode/info/"+barcodeId, function(r){
                vm.barcode = r.barcode;
                var url=vm.barcode.barcodeUrl+"?attname="
                location.href("url");
                //vm.getDept();
                // vm.getproduct();
            });

        },

        update: function () {
            var id = getSelectedRow();
            console.log("成功:"+id);

            if(id == null){
                return ;
            }
            vm.showList = false;

            vm.title = "修改";
            vm.getmodel(id);





            //获取角色信息
        },

        update2: function () {
            vm.title = "审批";
            var id = getSelectedRow();
            console.log("成功:"+id);

            if(id == null){
                return ;
            }
            $("#needCount").hide();
            $("#intCount").hide();
            $("#productId").hide();

            $("#sqRemarks").hide();

            vm.showList = false;




            vm.getmodel(id);
            //获取角色信息
        },

        del: function () {
            var barcodeId = getSelectedRows();
            console.log("成功:"+barcodeId);

            if(barcodeId == null){
                return ;
            }
            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "/sys/barcodeContext/delete",
                    contentType: "application/json",
                    data: JSON.stringify(barcodeId),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                                vm.reload();
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },

        dowloadmany: function () {
            var barcodeId = getSelectedRows();
            console.log("成功:"+barcodeId);

            if(barcodeId == null){
                return ;
            }
            confirm('确定要下载选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/barcodeContext/dowload",
                    contentType: "application/json",
                    data: JSON.stringify(barcodeId),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },

        saveOrUpdate: function () {
            var url = vm.barcode.barcodeId == null ? "sys/barcode/add" : "sys/barcode/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.barcode),
                success: function(r){
                    if(r.code === 0){
                        alert('操作成功', function(){
                            vm.reload();
                        });
                    }else{
                        alert(r.msg);
                    }
                }
            });
        },

        getmodel: function(barcodeId){
            console.log("成功请求:"+barcodeId);
            $.get(baseURL + "sys/barcode/info/"+barcodeId, function(r){
                vm.barcode = r.barcode;
                //vm.getDept();
                vm.getproduct();
            });
        },

        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'barcodePici': vm.q.barcodePici},
                // postData:{'productName': vm.q.productName},
                page:page
            }).trigger("reloadGrid");
        }
    }
});
