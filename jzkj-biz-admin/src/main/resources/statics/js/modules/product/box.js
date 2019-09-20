$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'product/sysbox/list',
        datatype: "json",
        colModel: [			
			{ label: '调压箱ID', name: 'boxId', index: "box_id", width: 45, key: true,hidden:true },
			{ label: '调压箱名称', name: 'boxName', width: 75 },
			{ label: '调压箱版本', name: 'boxVersion', width: 75 },
			{ label: '调压箱工厂', name: 'boxFactory', width: 75 },
			{ label: '调压箱公司', name: 'boxConpany', width: 75 },
			{ label: '调压箱地址', name: 'boxAddress', width: 75 },
			{ label: '调压箱类型', name: 'boxType', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">自建</span>' : 
					'<span class="label label-success">代管</span>';
			}},
			{ label: '调压箱图片', name: 'boxImage', width: 75 },
			{ label: '工艺图', name: 'processDrawing', width: 75 },
			{ label: '创建时间', name: 'createTime', index: "createTime", width: 85},
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
    
    new AjaxUpload('#upload', {
        action: baseURL + "product/sysbox/uploadFile",
        name: 'file',
        autoSubmit:true,
        responseType:"json",
        onSubmit:function(file, extension){
            /*if(vm.config.type == null){
                alert("云存储配置未配置");
                return false;
            }*/
            if (!(extension && /^(jpg|jpeg|png|gif)$/.test(extension.toLowerCase()))){
                alert('只支持jpg、png、gif格式的图片！');
                return false;
            }
        },
        onComplete : function(file, r){
            if(r.code == 0){
                //alert(r.url);
                vm.box.boxImage=r.url;
            }else{
                alert(r.msg);
            }
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
        	boxName: null
        },
        showList: true,
        title:null,
        roleList:{},
        box:{
            boxId:null,
            boxName:null,
            boxVersion:null,
            boxFactory:null,
            boxConpany:null,
            boxAddress:null,
            boxType:null,
            boxImage:null,
            boxVersion:null,
            processDrawing:null
            
        },
        fileList: []
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){
            vm.showList = false;
            vm.title = "新增";
            vm.box = {
            		boxId:null,
                    boxName:null,
                    boxVersion:null,
                    boxFactory:null,
                    boxConpany:null,
                    boxAddress:null,
                    boxType:null,
                    boxImage:null,
                    boxVersion:null,
                    processDrawing:null
            	};

        },        
        update: function () {
            var boxId = getSelectedRow();
            console.log(boxId);
            if(boxId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";

            vm.getBoxInfo(boxId);
        },
        del: function () {
            var boxIds = getSelectedRows();
            if(boxIds == null){
                return ;
            }

            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "product/sysbox/delete",
                    contentType: "application/json",
                    data: JSON.stringify(boxIds),
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
            var url = vm.box.boxId == null ? "product/sysbox/save" : "product/sysbox/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.box),
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
        getBoxInfo: function(userId){
            $.get(baseURL + "product/sysbox/info/"+userId, function(r){
                vm.box = r.box;
                console.log(vm.box,r)
            });
        },
        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'boxName': vm.q.boxName},
                page:page
            }).trigger("reloadGrid");
        },
       submitUpload() {
            this.$refs.upload.submit();
        },
        handleRemove(file, fileList) {
            console.log(file, fileList);
        },
        handlePreview(file) {
            console.log(file);
        },
        //成功返回
        Success(file, fileList) {
            console.log(file, fileList);
            console.log("成功");
        },
        //失败返回
        error(file, fileList) {
            console.log(file, fileList);
            console.log("err----");
        }
    }
});