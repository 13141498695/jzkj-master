$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/barcode/list',
        datatype: "json",
        colModel: [
			{ label: 'id', name: 'id',  width: 45,index: "id" ,key: true,hidden:true},
			{ label: '创建人', name: 'createPeople',  width: 45},
			{ label: '需要生成的数量', name: 'needCount', width: 75 },
            { label: '申请备注', name: 'sqRemarks', sortable: false, width: 75 },
			{ label: '创建时间', name: 'createTime', width: 90 },
            { label: '是否已生成', name: 'intCount', width: 60, formatter: function(value, options, row){
                    return value === 0 ?
                        '<span class="label label-danger">是</span>' :
                        '<span class="label label-success">否</span>';
                }},
            { label: '已生成的数量', name: 'scCount', width: 75 },
            { label: '压缩包', name: 'zipurl', width: 75 },

            { label: '处理人', name: 'operatePeople', width: 100 },
            { label: '处理备注', name: 'clRemark', width: 100 },
			{ label: '处理时间', name: 'operationTime', index: "operationTime", width: 85},
            { label: '是否已处理', name: 'barcodeStatus', width: 60, formatter: function(value, options, row){
                    return value === 0 ?
                        '<span class="label label-danger">是</span>' :
                        '<span class="label label-success">否</span>';
                }},
            {
                label: '操作', width: 160, align: 'center', sortable: false, formatter: function (value, col, barcode) {
                    return '<a class="btn btn-outline btn-primary"   href=" ' + barcode.zipurl + '?attname=">批量下载</a>';
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
        	modelName: null
        },
        showList: true,
        title:null,
        productList:{},
        barcode:{
            id:null,
            needCount:null,
            sqRemarks:null,
            intCount:null,
            barcodeStatus:null,
            zipurl:null

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
                          id:null,
                    needCount:null,
                    productId:null,
                barcodeStatus:null
            };



            vm.getproduct();
        },


        getproduct: function() {
            $.get(baseURL + "sys/product/prodcutlist", function (r) {
                vm.productList = r.product;
                console.log(vm.boxList,r)
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
            var id = getSelectedRows();
            console.log("成功:"+id);

            if(id == null){
                return ;
            }
             confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/barcode/delete",
                    contentType: "application/json",
                    data: JSON.stringify(id),
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

        renturnsp: function () {
            var id = getSelectedRows();
            console.log("成功:"+id);

            if(id == null){
                return ;
            }
             confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/barcode/delete",
                    contentType: "application/json",
                    data: JSON.stringify(id),
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

  saveOrUpdate: function () {
            var url = vm.barcode.id == null ? "sys/barcode/add" : "sys/barcode/update";
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

        getmodel: function(id){
            console.log("成功请求:"+id);
            $.get(baseURL + "sys/barcode/info/"+id, function(r){
                vm.barcode = r.barcode;
                //vm.getDept();
                vm.getproduct();
            });
        },

        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'modelName': vm.q.modelName},
                page:page
            }).trigger("reloadGrid");
        }
    }
});
