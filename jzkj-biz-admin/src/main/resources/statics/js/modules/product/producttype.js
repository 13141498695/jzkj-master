$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/producttype/list',
        datatype: "json",
        colModel: [		

			{ label: '产品ID', name: 'productTypeId', index: "productTypeId", width: 45, key: true },
			{ label: '产品类型', name: 'productTypeName', width: 75 },
			{ label: '创建时间', name: 'createTime', index: "createTime", width: 85}

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
/*var vm = new Vue({
    el:'#rrapp',
    data:{
        q:{
        	modelName: null
        },
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
    },*/
var vm = new Vue({

    el:'#rrapp',
    data:{
        q:{
        	productTypeName:null
        },
        showList: true,
        title:null,
        producttype:{
        	         productTypeId:null,
        	         productTypeName:null
        }
    },
    
    
    methods: {
        query: function () {
            vm.reload();
        },
        
        getType: function(){
            //加载公司树
            $.get(baseURL + "sys/producttype/typelist", function(r){
                ztree = $.fn.zTree.init($("#deptTree"), setting, r);
                var node = ztree.getNodeByParam("deptId", vm.user.deptId);
                if(node != null){
                    ztree.selectNode(node);

                    vm.user.deptName = node.name;
                }
            })
        },
        add: function(){
 
            vm.showList = false;
            vm.title = "新增";
       
            vm.producttype = { 
            		productTypeId:null,
       	            productTypeName:null
            };
        },
     
        update: function () {
            var productTypeId = getSelectedRow();
         
            if(productTypeId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";
            vm.getmodel(productTypeId);
            //获取角色信息
        },
        
        
        
        
        del: function () {
            var productTypeId = getSelectedRows();
            if(productTypeId == null){
                return ;
            }
            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/producttype/delete",
                    contentType: "application/json",
                    data: JSON.stringify(productTypeId),
                    success: function(r){
                        if(r.code == 0){
                            alert('操作成功', function(){
                                vm.reload();
                                location.href="modules/product/producttypelist.html";
                            });
                        }else{
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        saveOrUpdate: function () {
            var url = vm.producttype.productTypeId == null ? "sys/producttype/add" : "sys/producttype/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.producttype),
                success: function(r){
                    if(r.code === 0){
                        alert('操作成功', function(){
                            location.href="modules/product/producttypelist.html";
                        });
                    }else{
                        alert(r.msg);
                    }
                }
            });
        },
        getmodel: function(productTypeId){
            $.get(baseURL + "sys/producttype/info/"+productTypeId, function(r){
                vm.producttype = r.producttype;
            });
        },
        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
            /*	productTypeId:null,
   	         productTypeName:null*/
                postData:{'productTypeName': vm.q.productTypeName},
                page:page
            }).trigger("reloadGrid");
        }
    }
});