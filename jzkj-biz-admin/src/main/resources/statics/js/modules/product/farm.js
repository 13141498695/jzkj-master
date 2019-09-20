$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/farming/list',
        datatype: "json",
        colModel: [
            { label: '农户id', name: 'farmingId',  index: "farmingId",width: 45, key: true,hidden:true},
            { label: '农户名称', name: 'farmingname', width: 40 },
            { label: '农户电话', name: 'farmingPhone', sortable: false, width: 40 },
            { label: '身份证号', name: 'farmingCard', width: 20 },
            { label: '邮箱', name: 'farmingEmail', width: 20 },
            { label: '微信号', name: 'farmingWx', width: 30 },
            { label: '头像', name: 'farmingImage', width: 30 ,hidden:true},
			{ label: '创建时间', name: 'createTime', width: 85},
        ],

        // viewrecords: true,
        // height: 385,
        // rowNum: 10,
        // rowList : [10,30,50],
        // rownumbers: true,
        // rownumWidth: 25,
        // autowidth:true,
        // multiselect: true,
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
            farmingname:null
        },
        showList: true,
        title:null,
        farm:{
            farmingId:null,
            farmingname:null,
            farmingPhone:null,
            farmingCard:null,
            farmingWx:null,
            farmingImage:null,
            farmingEmail:null,

        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){

            vm.showList = false;
            vm.title = "新增";
            vm.farm = {

                farmingId:null,
                farmingname:null,
                farmingPhone:null,
                farmingCard:null,
                farmingWx:null,
                farmingImage:null,
                farmingEmail:null,
            };
            vm.getDept();
        },
        update: function () {
            var modelId = getSelectedRow();

            if(modelId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";
            vm.getmodel(modelId);
           // var ue = UE.getEditor('editor');

            //获取角色信息
        },
        handleSuccessListPicUrl: function (res, file) {
            vm.farm.farmingImage = file.response.url;
        },
        handleFormatError: function (file) {
            this.$Notice.warning({
                title: '文件格式不正确',
                desc: '文件 ' + file.name + ' 格式不正确，请上传 jpg 或 png 格式的图片。'
            });
        },
        eyeImageListPicUrl: function () {
            var url = vm.farm.farmingImage;
            eyeImage(url);
        },
        handleMaxSize: function (file) {
            this.$Notice.warning({
                title: '超出文件大小限制',
                desc: '文件 ' + file.name + ' 太大，不能超过 2M。'
            });
        },
        del: function () {
            var farmingId = getSelectedRows();
            console.log(farmingId);
            console.log('11111')

            if(farmingId == null){
                return ;
            }
            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/farming/delete",
                    contentType: "application/json",
                    data: JSON.stringify(farmingId),
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

        devlopr: function () {
            var productId = getSelectedRows();


            if(productId == null){
                return ;
            }
            confirm('确定要上线选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/product/devlopr",
                    contentType: "application/json",
                    data: JSON.stringify(productId),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                                location.href="modules/product/productlist.html";
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        low: function () {
            var productId = getSelectedRows();
            if(productId == null){
                return ;
            }
            confirm('确定要下线选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/product/low",
                    contentType: "application/json",
                    data: JSON.stringify(productId),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                                location.href="modules/product/productlist.html";
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        saveOrUpdate: function () {
            var url = vm.farm.farmingId == null ? "sys/farming/save" : "sys/farming/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.farm),
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
        getmodel: function(farmingId){
            $.get(baseURL + "sys/farming/info/"+farmingId, function(r){
                vm.farm = r.farm;
            });
        },

        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'farmingname': vm.q.farmingname},
                page:page
            }).trigger("reloadGrid");
        }
    }
});
