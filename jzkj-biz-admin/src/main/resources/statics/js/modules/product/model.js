$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/model/list',
        datatype: "json",
        colModel: [		
			{ label: '模型ID', name: 'modelId', index: "modelId", width: 45, key: true },
			{ label: '模型名称', name: 'modelName', width: 75 },
            { label: '模型标识', name: 'modelIdentification', sortable: false, width: 75 },
			{ label: '数据类型', name: 'modelDatatype', width: 90 },
			{ label: '取值范围', name: 'modelSpam', width: 100 },
			{ label: '模型描述', name: 'modelDesc', width: 100 },
			{ label: '读写类型', name: 'modelReadorwrite', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">可读</span>' : 
					'<span class="label label-success">可写</span>';
			}},
			
			{ label: '创建时间', name: 'createtime', index: "createtime", width: 85}
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
        roleList:{},
        model:{
            status:1,
            modelId:null,
            modelName:null,
            modelDatatype:null,
            modelIdentification:null,
            modelSpam:null,
            modelReadorwrite:null,
            modelDesc:null
        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){
 

        },
        getDept: function(){
            //加载公司树
            $.get(baseURL + "sys/model/add", function(r){
                ztree = $.fn.zTree.init($("#deptTree"), setting, r);
                var node = ztree.getNodeByParam("deptId", vm.model.deptId);
                if(node != null){
                    ztree.selectNode(node);

                    vm.model.deptName = node.name;
                }
            })
        },
        update: function () {
            var modelId = getSelectedRow();
          
            if(modelId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";
            vm.getmodel(modelId);
            
            //获取角色信息
        },
        
        
        
        
        del: function () {
            var modelId = getSelectedRows();
            if(modelId == null){
                return ;
            }

            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/model/delete",
                    contentType: "application/json",
                    data: JSON.stringify(modelId),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                                vm.reload();
                                location.href="modules/product/modellist.html";
                              });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        saveOrUpdate: function () {
            var url = vm.model.modelId == null ? "sys/model/add" : "sys/model/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.model),
                success: function(r){
                    if(r.code === 0){
                        alert('操作成功', function(){
                            vm.reload();
                            location.href="modules/product/modellist.html";
                        });
                    }else{
                        alert(r.msg);
                    }
                }
            });
        },
        getmodel: function(modelId){
            $.get(baseURL + "sys/model/info/"+modelId, function(r){
                vm.model = r.model;
                console.log(model);
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