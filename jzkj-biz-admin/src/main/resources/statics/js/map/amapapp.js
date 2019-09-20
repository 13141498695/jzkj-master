/**
 * Created by Administrator on 2015/11/13.
 */
var app = {};
app.table = null;
app.map = null;
app.geo = null;

function init(){
    app.table = null;
    var table = $('#parkingList').DataTable({
        ordering: false,
        select: true,
        ajax: {
            url: '/api/parking/find?size=1000',
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
            { data: null, defaultContent: '<button>Edit!</button>'}
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

    //alert(table.rows.length);
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

    app.map.clearMap();

    if (lng == null) {
        app.geo.getLocation(addr, function (status, result) {
            if (status === 'complete' && result.info === 'OK') {
                geocoder_CallBack(result, id, aname);
            } else {
                alert("error");
            }
        });
    }
    else {
        alert("222" + lng);
        addMarker(1, lng, lat, id, aname);
    }
}


function geocoder_CallBack(data, id, aname) {
    var lng;
    var lat;

    //地理编码结果数组
    var geocode = new Array();
    geocode = data.geocodes;
    for (var i = 0; i < geocode.length; i++) {
        lng = geocode[i].location.getLng();
        lat = geocode[i].location.getLat();

        addMarker(i, geocode[i].location.getLng(), geocode[i].location.getLat(), id, aname);

    }
    map.setFitView(); // 调整到合理视野

    //更新数据
    updatePosition(id, lng, lat);
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
            location.reload();
        },
        error :function(){
            alert("网络连接出错！");
        }
    });
}

function updateUI(id, lng, lat) {
    //TODO 遍历table找到row,更新数据
    //var data = app.table.rows({'id':id}).data();
    //data.lng = point.lng;
    //data.lat = point.lat;
    app.table.rows().invalidate();
}

function addMarker(i, lngX, latY, id, aname) {
    var markerOption = {
        icon: "http://webapi.amap.com/theme/v1.3/markers/n/mark_b" + (i + 1) + ".png",
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