/**
 * Created by Administrator on 2015/11/13.
 */
var app = {};
app.table = null;
app.map = null;
app.geo = null;

var mycount = 0;

function init(){
    app.table = null;
    var table = $('#parkingList').DataTable({
        ordering: false,
        select: true,
        ajax: {
            url: '/api/parking/find?size=5000',
            dataSrc: 'content'
        },
        columns: [
            { data: 'id'},
            { data: 'name', render: function(data, type, row){
                return data ;//+ '('+row.address+')';
            } },
            { data: 'addr', render: function(data, type, row){
                return row.address;
            } },
            { data: 'lng', render: function(data, type, row){
                if(row.lng==null)
                    return '<font style="color:red">无</font>';
                return row.lng;
            }},
            { data: 'lat', render: function(data, type, row){
                if(row.lat==null)
                    return '<font style="color:red">无</font>';
                return row.lat;
            }},
            { data: null, defaultContent: '<button>Edit!</button>'},

        ]
        /* ,
         columnDefs: [{
         targets: 2,
         data: null,
         defaultContent: "<button>Edit!</button>"
         }]
         */
    });
    $('#parkingList tbody').on('click', 'button', function() {
        var data = table.row($(this).parents('tr')).data();
        drawMarker(data);
    });
    app.table = table;

    //alert(table.fnGetNodes());

    ////循环加点
    //for(i = 0;i<1;i++) { //table.rows.length
    //    var lng = table.rows(i).data().lng;
    //    alert(lng);
    //}

    //app.table.data()


//    var table = $('#example').DataTable();
//
//// Increment a counter for each row
//    table.data().each( function (d) {
//        d.counter++;
//    } );
//
//// Invalidate all rows and redraw
//    table.rows().invalidate().draw();
}

function getTableContent(){
    var table =  $("#parkingList").dataTable();
    var nTrs = table.fnGetNodes();//fnGetNodes获取表格所有行，nTrs[i]表示第i行tr
    alert(nTrs.length);
    for(var i = 0; i < nTrs.length; i++){
        //  if($(nTrs[i]).hasClass('selected')){//相当于$(tr)
        var t = table.fnGetData(nTrs[i]);
        alert("aaaaaa:" + t[2]);
        console.log("aaaaaa:" + t[2]);//获取一行第3列数据
        // }
    }
}

$(document).ready(init);



$(document).ready(function() {
    // 高德地图API功能
    var map = new AMap.Map('map_canvas', {
        resizeEnable: true,
        level: 11, //地图显示的缩放级别
        doubleClickZoom:false
    });

    //map.setCity("上海");

    var myGeo;
    AMap.service(["AMap.Geocoder"], function () {
        myGeo = new AMap.Geocoder({
            city: "021", //城市，默认：“全国”
            radius: 500 //范围，默认：500
        });
        app.geo = myGeo;
        app.map = map;
    });



});

function drawMarker(data) {

    var id = data.id;
    var lng = data.lng;
    var lat = data.lat;
    var aname = data.name;
    var addr = data.address;
    //app.map.clearMap();
    //if (lng == null) {

    if (addr != null) {
        app.geo.getLocation(addr, function (status, result) {
            if (status === 'complete' && result.info === 'OK') {
                geocoder_CallBack(result, id, aname);
            } else {
                mycount ++;
                //alert("error");
            }
        });
    } else {
        //addMarker(1, lng, lat, id, aname);
    }
}


function geocoder_CallBack(data, id, aname) {
    var changelng;
    var changelat;
    var changeAddr;
    var changelevel;
    //地理编码结果数组
    var geocode = new Array();
    geocode = data.geocodes;
    for (var i = 0; i < geocode.length; i++) {
        changelng = geocode[i].location.getLng();
        changelat = geocode[i].location.getLat();
        changeAddr = geocode[i].formattedAddress;
        changelevel = geocode[i].level;

        //addMarker(i, geocode[i].location.getLng(), geocode[i].location.getLat(), id, aname);
    }

    //app.map.setFitView(); // 调整到合理视野

    //更新数据id,changeLevel,changeAddress, changeLng, changeLat
    if(changelat != null) {
        updatePositionAll(id, changelevel, changeAddr, changelng, changelat);
    } else {
        alert("11111" + changeAddr);
    }
}


function updateUI(id, lng, lat) {
    //TODO 遍历table找到row,更新数据
    //var data = app.table.rows({'id':id}).data();
    //data.lng = point.lng;
    //data.lat = point.lat;
    app.table.rows().invalidate();
}

// 实例化点标记
function addMarker2(i,  lngX, latY, id, aname) {
    marker = new AMap.Marker({
        icon: "http://webapi.amap.com/images/marker_sprite.png",
        position: [lngX, latY]
    });
    // 设置鼠标划过点标记显示的文字提示
    marker.setTitle(id + "|" + aname);
    marker.setMap(app.map);
}


function addMarker(i, lngX, latY, id, aname) {
    var markerOption = {
        icon: "http://webapi.amap.com/images/marker_sprite.png",
        //icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_b" + i + ".png",
        position: [lngX, latY],
        draggable: false,
        cursor: 'move',
        raiseOnDrag: true
    };
    var marker = new AMap.Marker(markerOption);
    // 设置鼠标划过点标记显示的文字提示
    marker.setTitle(id + "|" + aname);
    // 设置label标签
    marker.setLabel({//label的父div默认蓝框白底右下角显示，样式className为：amap-marker-label
        offset:new AMap.Pixel(20,5),//修改父div相对于maker的位置
        content: aname
    });
    marker.on("dblclick", dclickhandler);
    marker.on("dragend", drendhandler);

    marker.setMap(app.map);
    //var infoWindow = new AMap.InfoWindow({
    //    content: id + "|" + aname,
    //    autoMove: true,
    //    size: new AMap.Size(150, 0),
    //    offset: {x: 0, y: -30}
    //});
    //windowsArr.push(infoWindow);
    //
    //var aa = function(e) {
    //    infoWindow.open(map, mar.getPosition());
    //};
    //marker.on( "mouseover", aa);

}

/**
 * 双击可以拖拽
 */
function dclickhandler(e) {
    var p = e.target;
    if (p instanceof AMap.Marker) {
        p.setDraggable(true);
    }
}

/**
 * 拖拽结束
 */
function drendhandler(e) {
    var p = e.target;
    if (p instanceof AMap.Marker) {
        p.setDraggable(false);
        //获取marker的位置
        var point = p.getPosition();
        var title = p.getTitle();
        var id = parseInt(title.split('|')[0]);

        //更新坐标数据
        updatePosition(id, point.getLng(), point.getLat());
        //更新界面
        updateUI(id, point.getLng(), point.getLat());
    }

}


function updatePosition(id, lng, lat) {
    //更新经纬度信息
    $.ajax( {
        type : "POST",
        url : "/api/parking/save",
        data : {
            'id' : id,
            'lng' : lng,
            'lat' : lat
        },
        dataType: "json",
        success : function(data) {
            //TODO
            //location.reload();
        },
        error :function(){
            alert("网络连接出错！");
        }
    });
}


function updatePositionAll(id,changeLevel,changeAddress, changeLng, changeLat) {
    //更新经纬度信息
    $.ajax( {
        type : "POST",
        url : "/api/parking/saveAll",
        data : {
            'id' : id,
            'changeLevel' : changeLevel,
            'changeAddress' : changeAddress,
            'changeLng' : changeLng,
            'changeLat' : changeLat,
            'lng' : changeLng,
            'lat' : changeLat
},
        dataType: "json",
        success : function(data) {
            //TODO
            //location.reload();
        },
        error :function(){
            alert("网络连接出错！");
        }
    });
}

function initAllPosition() {
    //更新经纬度信息
    $.ajax( {
        type : "POST",
        url: '/api/parking/findAll',
        dataType: "json",
        success : function(data) {
            alert(data.length);
            for(var i = 0;i<data.length;i++){
                drawMarker(data[i]);
            }
            //location.reload();
        },
        error :function(){
            alert("网络连接出错！");
        }
    });
}

function showAllPosition() {
    document.getElementById("showPosition").disabled="disabled";
    //更新经纬度信息
    $.ajax( {
        type : "POST",
        url: '/api/parking/findAll',
        dataType: "json",
        success : function(data) {
            //data.length
            for(var i = 0;i<data.length;i++){
                var id = data[i].id;
                var lng = data[i].lng;
                var lat = data[i].lat;
                var aname = data[i].name;
                var addr = data[i].address;
                if (lat != null) {
                    addMarker(1, lng, lat, id, aname+"("+addr+")");
                    app.map.setFitView();
                }
            }
        },
        error :function(){
            alert("网络连接出错！");
        }
    });
}