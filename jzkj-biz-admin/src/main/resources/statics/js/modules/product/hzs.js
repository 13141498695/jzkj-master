$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/cooperative/list',
        datatype: "json",
        colModel: [

            { label: '农户id', name: 'cooperativeid',  index: "cooperativeid",width: 45, key: true,hidden:true},
            { label: '合作社名称', name: 'cooperativename', width: 40 },
            { label: '合作社地址', name: 'cooperative_Address', sortable: false, width: 40 },
            { label: '合作社电话', name: 'cooperativePhone', width: 20 },
            { label: '邮箱', name: 'cooperativelxr', width: 20 },
            { label: '经度', name: 'longitude', width: 30 },
            { label: '纬度', name: 'latitude', width: 30 ,hidden:true},
            { label: '上级合作社名称', name: 'parentName', width: 30 ,hidden:true},
			{ label: '创建时间', name: 'createTime', width: 85},
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
            cooperativename:null
        },
        showList: true,
        title:null,
        cooperative:{
            cooperativeid:null,
            cooperativename:null,
            cooperativeAddress:null,
            cooperativePhone:null,
            cooperativelxr:null,
            longitude:null,
            latitude:null

        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){

            vm.showList = false;
            vm.title = "新增";
            vm.cooperative = {
                cooperativeid:null,
                cooperativename:null,
                cooperativeAddress:null,
                cooperativePhone:null,
                cooperativelxr:null,
                longitude:null,
                latitude:null
            };
            vm.getDept();
        },
        update: function () {
            var cooperativeid = getSelectedRow();
            console.log(cooperativeid);

            if(cooperativeid == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";
            vm.getmodel(cooperativeid);

            //获取角色信息
        },

        del: function () {
            var cooperativeid = getSelectedRows();
            console.log(cooperativeid);
            console.log('11111')

            if(cooperativeid == null){
                return ;
            }
            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/cooperative/delete",
                    contentType: "application/json",
                    data: JSON.stringify(cooperativeid),
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
            var url = vm.cooperative.cooperativeid == null ? "sys/cooperative/save" : "sys/cooperative/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.cooperative),
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
        getmodel: function(cooperativeid){
            $.get(baseURL + "sys/cooperative/info/"+cooperativeid, function(r){
                vm.cooperative = r.cooperative;
                console.log(cooperative);

            });
        },

        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'cooperativename': vm.q.cooperativename},
                page:page
            }).trigger("reloadGrid");
        }
    }
});
