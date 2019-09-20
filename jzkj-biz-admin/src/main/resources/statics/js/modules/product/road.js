$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'product/sysroad/list',
        datatype: "json",
        colModel: [			
			{ label: '路ID', name: 'roadId', index: "road_id", width: 45, key: true,hidden:true },
			{ label: '路名称', name: 'roadName', width: 75 },
			{ label: '路描述', name: 'roadDesc', width: 75 },
			{ label: '调压箱ID', name: 'roadBoxId', width: 45, hidden:true },
			{ label: '调压箱', name: 'boxName', width: 75 },
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

var vm = new Vue({
    el:'#rrapp',
    data:{
        q:{
            roadName: null
        },
        showList: true,
        title:null,
        boxList:{},
        road:{
            roadId:1,
            roadName:null,
            roadDesc:null,
            roadBoxId:null
        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){
            vm.showList = false;
            vm.title = "新增";
            vm.road = {roadId:null, roadName:null, roadDesc:null,roadBoxId:null};
            vm.getBoxInfo();
        },        
        update: function () {
            var userId = getSelectedRow();
            console.log(userId);
            if(userId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";

            vm.getRoadInfo(userId);
            vm.getBoxInfo();
        },
        del: function () {
            var userIds = getSelectedRows();
            //alert(userIds);
            if(userIds == null){
                return ;
            }

            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "product/sysroad/delete",
                    contentType: "application/json",
                    data: JSON.stringify(userIds),
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
            var url = vm.road.roadId == null ? "product/sysroad/save" : "product/sysroad/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.road),
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
        getRoadInfo: function(userId){
        	console.log(userId);
            $.get(baseURL + "product/sysroad/info/"+userId, function(r){
                vm.road = r.road;
                console.log(vm.road,r.road)
                vm.getBoxInfo();
            });
        },
        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'roadName': vm.q.roadName},
                page:page
            }).trigger("reloadGrid");
        },
        getBoxInfo: function(userId){
            $.get(baseURL + "product/sysbox/boxlist", function(r){
                vm.boxList = r;
                //console.log(vm.boxList,r)
            });
        },
    }
});