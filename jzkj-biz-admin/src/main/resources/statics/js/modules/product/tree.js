$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + '/sys/tree/list',
        datatype: "json",


    colModel: [
            { label: 'id', name: 'treeId',  index: "treeId",width: 45, key: true,hidden:true},
            { label: '名称', name: 'treename', width: 40 },
            { label: '描述', name: 'treeContext', sortable: false, width: 40 },
            { label: '图片', name: 'treeImages', width: 20 },
            { label: '果树视频', name: 'treeVedio', width: 20 },
            { label: '纬度', name: 'treeLongitude', width: 30 },
            { label: '经度', name: 'treeLatitude', width: 30 ,hidden:true},
			{ label: '创建时间', name: 'createTime', width: 50},
        {
            label: '操作', width: 160, align: 'center', sortable: false, formatter: function (value, col, tree) {
                return '<a class="btn btn-outline btn-primary"   href=" ' + tree.treeImages + '?attname=">预览图片</a>'+
                   '<a class="btn btn-outline btn-primary"   href=" ' + tree.treeVedio + '?attname=">预览视频</a>';
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
            treeName:null
        },
        showList: true,
        title:null,
        tree:{
            treeId:null,
            treename:null,
            treeContext:null,
            treeImages:null,
            treeVedio:null,
            treeLongitude:null,
            treeLatitude:null
        }
    },
    methods: {
        query: function () {
            vm.reload();
        },
        add: function () {

            vm.showList = false;
            vm.title = "新增";
            vm.tree = {

                treeId: null,
                treename: null,
                treeContext: null,
                treeImages: null,
                treeVedio: null,
                treeLongitude: null,
                treeLatitude: null
            };
            vm.getDept();
        },
        update: function () {
            var modelId = getSelectedRow();

            if (modelId == null) {
                return;
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
            var treeId = getSelectedRows();
            console.log(treeId);
            console.log('11111')

            if (treeId == null) {
                return;
            }
            confirm('确定要删除选中的记录？', function () {
                $.ajax({
                    type: "POST",
                    url: baseURL + "sys/tree/delete",
                    contentType: "application/json",
                    data: JSON.stringify(treeId),
                    success: function (r) {
                        if (r.code == 0) {
                            alert('操作成功', function () {
                                vm.reload();
                            });
                        } else {
                            alert(r.msg);
                        }
                    }
                });
            });
        },
        saveOrUpdate: function () {
            var url = vm.tree.treeId == null ? "sys/tree/save" : "sys/tree/update";
            $.ajax({
                type: "POST",
                url: baseURL + url,
                contentType: "application/json",
                data: JSON.stringify(vm.tree),
                success: function (r) {
                    if (r.code === 0) {
                        alert('操作成功', function () {
                            vm.reload();
                        });
                    } else {
                        alert(r.msg);
                    }
                }
            });
        },
        getmodel: function (treeId) {
            $.get(baseURL + "sys/tree/info/" + treeId, function (r) {
                vm.tree = r.tree;
            });
        },

        reload: function () {
            vm.showList = true;
            var page = $("#jqGrid").jqGrid('getGridParam', 'page');
            $("#jqGrid").jqGrid('setGridParam', {
                postData: {'treename': vm.q.treename},
                page: page
            }).trigger("reloadGrid");
        },

        handleSuccessAvatar: function (res, file) {
            vm.tree.treeImages = file.response.url;
        },
        handleSuccessItemPicUrl: function (res, file) {
            vm.tree.treeImages = file.response.url;
            alert("文件上传成功")
        },
        handleSuccessVideoItemPicUrl: function (res, file) {
            vm.tree.treeVedio = file.response.url;
            alert("文件上传成功")
        },
        handleSuccessScenePicUrl: function (res, file) {
            vm.tree.treeImages = file.response.url;
        },
        handleFormatError: function (file) {
            this.$Notice.warning({
                title: '文件格式不正确',
                desc: '文件 ' + file.name + ' 格式不正确，请上传 jpg 或 png 格式的图片。'
            });
        },
        handleMaxSize: function (file) {
            this.$Notice.warning({
                title: '超出文件大小限制',
                desc: '文件 ' + file.name + ' 太大，不能超过 2M。'
            });
        },
        eyeImageAvatar: function () {
            var url = vm.tree.treeImages;
            eyeImage(url);
        },
        eyeImageItemPicUrl: function () {
            var url = vm.tree.treeImages;
            eyeImage(url);
        },
        eyeImageScenePicUrl: function () {
            var url = vm.tree.treeImages;
            eyeImage(url);
        },
        handleSubmit: function (name) {
            handleSubmitValidate(this, name, function () {
                vm.saveOrUpdate()
            });
        },
        handleReset: function (name) {
            handleResetForm(this, name);
        }
    }
});
