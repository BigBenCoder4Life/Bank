<%-- 
    Document   : GoogleMaps
    Created on : Apr 9, 2014, 5:55:21 PM
    Author     : kirtlepb
--%>

<!DOCTYPE html>
<body>
    
    <script type="text/javascript" src="http://maps.google.com/maps/api/js?v=3&sensor=false">
        
    </script>
    <div id="gmap_canvas" style="height:500px; width:600px;"></div>
    <style type="text/css" media="screen">
        #gmap_canvas img{max-width:none !important;background:none !important;}.gm-style-iw 
        span{
             height:auto !important;
             display:block;
             white-space:nowrap;
             overflow:hidden !important;}.gm-style-iw strong{font-weight:400;}.map-data{ position:absolute;top:-1668px;}.gm-style-iw{ height:auto !important;
             color:#000000;
             display:block;
             white-space:nowrap;
             width:auto !important;
             line-height:18px;
             overflow:hidden !important;}
     </style>
     <iframe id="data" src="http://www.addmap.org/maps.php" class="map-data"></iframe>
     <a id="get-map-data" href="http://www.stromleo.de"class="map-data">huepfen ueber hier</a>
     <script type="text/javascript">
         function init_map(){ 
             var myOptions={zoom:8, center: new google.maps.LatLng (37.4315734,-78.65689420000001), 
                 mapTypeId: google.maps.MapTypeId.HYBRID};
             map = new google.maps.Map (document.getElementById("gmap_canvas"),myOptions); 
             marker = new google.maps.Marker({map: map, position: new google.maps.LatLng (37.4315734,-78.65689420000001)}); 
             infowindow = new google.maps.InfoWindow ({content:"<span style='height:auto !important; display:block; white-space:nowrap; overflow:hidden !important;'><strong style='font-weight:400;'></strong><br><br> </span>" });
             google.maps.event.addListener (marker, "click", function(){ infowindow.open(map,marker);});
         } 
         google.maps.event.addDomListener (window, "load", init_map);
          </script>
</body>


