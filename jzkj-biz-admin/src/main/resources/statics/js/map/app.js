var app = {};
app.table = null;
app.map = null;
app.geo = null;
var parkMarker = null;

$(document).ready(function(){
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
                    return '<font style="color:red">没有设置</font>';
                return row.lng;
            }},
            { data: 'lat', render: function(data, type, row){
                if(row.lat==null)
                    return '<font style="color:red">没有设置</font>';
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
});

$(document).ready(function(){
    // 百度地图API功能
    var map = new BMap.Map("map_canvas");
    //var point = new BMap.Point(116.400244,39.92556);
    map.centerAndZoom("上海", 12);
    map.enableScrollWheelZoom(true);
    //var marker = new BMap.Marker(point);  // 创建标注
    //map.addOverlay(marker);              // 将标注添加到地图中
    //
    //var label = new BMap.Label("我是文字标注哦",{offset:new BMap.Size(20,-10)});
    //marker.setLabel(label);
    var myGeo = new BMap.Geocoder();

    app.geo = myGeo;
    app.map = map;
});

function drawMarker(data) {
    var id = data.id;
    var lng = data.lng;
    var lat = data.lat;
    var aname = data.name;
    var addr = data.addr;
    if(lng == null) {
        app.geo.getPoint(addr, function(point){
            if (point) {
                var address = new BMap.Point(point.lng, point.lat);
                addMarker(address,
                    aname,
                    new BMap.Label(id + "|" + addr, {offset: new BMap.Size(20, -10)}));
                //更新数据
                updatePosition(id, point);
            } else {
                alert("没有找到此地址");
            }
        }, "上海市");
    } else {
        var address = new BMap.Point(lng, lat);
        addMarker(address,
            aname,
            new BMap.Label(id + "|" + addr, {offset: new BMap.Size(20, -10)}));
    }
}

function updatePosition(id, point) {
    //TODO 更新经纬度信息
}

function updateUI(id,point) {
    //TODO 遍历table找到row,更新数据
    //var data = app.table.rows({'id':id}).data();
    //data.lng = point.lng;
    //data.lat = point.lat;
    app.table.rows().invalidate();
}

function addMarker(point,aname,label){
    var marker = new BMap.Marker(point);
    marker.addEventListener("dblclick",dclickhandler);
    marker.addEventListener("dragend", drendhandler); //
    app.map.addOverlay(marker);
    marker.setTitle(aname);
    marker.setLabel(label);

    marker.disableDragging();

}

/**
 * 双击可以拖拽
 */
function dclickhandler(e){

    var p = e.target;
    if(p instanceof BMap.Marker) {
        p.enableDragging();
    }
}

/**
 * 拖拽结束
 */
function drendhandler(e) {
    var p = e.target;
    if(p instanceof BMap.Marker) {
        p.disableDragging();
        //获取marker的位置
        var point = p.getPosition();
        var label = p.getLabel();
        var content = label.getTitle();
        alert(content);
        var id = parseInt(content.split('|')[0]);
        alert(id);
        //更新坐标数据
        updatePosition(id, point);
        //更新界面
        updateUI(id,point);
    }

}


function clearMarker(){
    if(parkMarker==null)
        return;

}