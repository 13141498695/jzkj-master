$(function () {
	//$('#sysDeviceModelllist').multiselect();
    $("#jqGrid").jqGrid({
        url: baseURL + 'devices/devices/list',
        datatype: "json",
        colModel: [

       		{ label: '产品名称', name: 'deviceSysname', width: 75 },
			{ label: '产品标题', name: 'deviceId', index: "box_id", width: 45, key: true,hidden:true },
			{ label: '产品类型', name: 'deviceType', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">智能调压器</span>' : 
					'<span class="label label-success">采集仪</span>';
			}},
			{ label: '产品名称', name: 'deviceStatus', width: 60, formatter: function(value, options, row){
				return value === 0 ? 
					'<span class="label label-danger">使用</span>' : 
					'<span class="label label-success">停用</span>';
			}},
			{ label: '产品名称DTU编号', name: 'deviceDtuid', width: 75 },
			{ label: '产品名称信息', name: 'deviceRoadId', width: 75,hidden:true },
			{ label: '产品名称路信息', name: 'roadName', width: 75 },
			{ label: '产品名称编号', name: 'deviceSim', width: 75 },
			{ label: '产品名详情', name: 'deviceDatatablename', width: 75 },
			{ label: '产品负责人电话', name: 'devicePicPhone', width: 75 },
			{ label: '产品负责人邮箱', name: 'devicePicEmail', width: 75 },
			{ label: '产品负责人微信', name: 'devicePicWeixin', width: 75 },
			{ label: '产品硬件生成唯一编码', name: 'deviceUniqueno', width: 75 },
			{ label: '产品数据模型字段集', name: 'sysDeviceModelllist', width: 75 },
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
});
var setting = {
	    data: {
	        simpleData: {
	            enable: true,
	            idKey: "id",
	            pIdKey: "pId",
	            rootPId: "0"
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
        	deviceName: null
        },
        showList: true,
        title:null,
        modelList:[],
        deviceModelList:[],
        device:{
        	deviceId:null,
        	deviceType:null,
        	deviceStatus:null,
        	deviceDtuid:null,
        	deviceRoadId:null,
        	deviceSysname:null,
        	deviceSim:null,
        	deviceDatatablename:null,
        	devicePicPhone:null,
        	devicePicWeixin:null,
        	deviceUniqueno:null,
        	roadName:null
        },
        roadName:"",
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function(){
            vm.showList = false;
            vm.title = "新增";
            vm.device = {
            		deviceId:null,
                	deviceType:null,
                	deviceStatus:null,
                	deviceDtuid:null,
                	deviceRoadId:null,
                	deviceSysname:null,
                	deviceSim:null,
                	deviceDatatablename:null,
                	devicePicPhone:null,
                	devicePicWeixin:null,
                	deviceUniqueno:null,
            	};
            vm.getRoad();
            vm.getModleList();
        },        
        update: function () {
            var deviceId = getSelectedRow();
            
            if(deviceId == null){
                return ;
            }
            vm.showList = false;
            vm.title = "修改";

            vm.getDeviceInfo(deviceId);
        },
        del: function () {
            var devicesIds = getSelectedRows();
            if(devicesIds == null){
                return ;
            }

            confirm('确定要删除选中的记录？', function(){
                $.ajax({
                    type: "POST",
                    url: baseURL + "devices/devices/delete",
                    contentType: "application/json",
                    data: JSON.stringify(devicesIds),
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
            var url = vm.device.deviceId == null ? "devices/devices/save" : "devices/devices/update";
            vm.device.sysDeviceModelllist = vm.deviceModelList.join(";");
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.device),
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
        getDeviceInfo: function(deviceId){
            $.get(baseURL + "devices/devices/info/"+deviceId, function(r){
                vm.device = r.devices;
                vm.deviceModelList = r.models;                
                vm.getRoad();
                vm.getModleList();
            });
        },
        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam','page');
            $("#jqGrid").jqGrid('setGridParam',{
                postData:{'deviceName': vm.q.deviceName},
                page:page
            }).trigger("reloadGrid");
        },
        roadTree: function(){
            layer.open({
                type: 1,
                offset: '50px',
                skin: 'layui-layer-molv',
                title: "选择路信息",
                area: ['300px', '450px'],
                shade: 0,
                shadeClose: false,
                content: jQuery("#roadLayer"),
                btn: ['确定', '取消'],
                btn1: function (index) {
                    var node = ztree.getSelectedNodes();
                    //选择路信息
                    vm.device.deviceRoadId = node[0].id;
                    vm.roadName = node[0].name;
                    layer.close(index);
                }
            });
        },
        getRoad: function(){
            //加载路信息
            $.get(baseURL + "product/sysroad/alllist", function(r){
                ztree = $.fn.zTree.init($("#roadTree"), setting, r);
                var node = ztree.getNodeByParam("id", vm.device.deviceRoadId);
            	if(node != null){
                    ztree.selectNode(node);
                    
                    vm.roadName = node.name;
                    vm.device.deviceRoadId = node.id
                }
            })
        },
        getModleList: function(){
            //加载路信息
            $.get(baseURL + "sys/model/modellist", function(r){
                vm.modelList = r;
                //$("#sysDeviceModelllist").multiselect();
            })
        }
    }
});