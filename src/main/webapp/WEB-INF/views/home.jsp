<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="es.uniovi.miw.ws.feelings.model.*,java.util.List"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>SW Feelings Analyzer - Visualizer</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Le styles -->
<link href="./css/bootstrap.css" rel="stylesheet">
<link href="./css/style.css" rel="stylesheet">
<link href="./css/bootstrap-responsive.css" rel="stylesheet">

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script src="./js/highcharts.js"></script>
<script src="./js/exporting.js"></script>
<script src="./js/gray.js"></script>

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="../js/html5shiv.js"></script>
    <![endif]-->
</head>

<body>
	<%
	    List<Feeling> feelings = (List<Feeling>)request.getAttribute("feelings");
					int i = 0;
					String sOld = "";
					String sNew = "";
					for (Feeling feeling : feelings){
					    sOld+=feeling.getPuntOld();
					    sNew+=feeling.getPuntNew();
					    if(i<feelings.size()){
							sOld+=",";
							sNew+=",";
					    }
					    i++;
					}
	%>
	<div class="container-narrow">

		<div class="masthead">
			<ul class="nav nav-pills pull-right">
				<li class="active"><a href="./">Home</a></li>
				<li><a href="./about">About</a></li>
			</ul>
			<h3 class="muted">SW Feeling Analyzer</h3>
		</div>

		<hr>
		<div class="jumbotron">
			<h1>Discover the people's feeling on Twitter!</h1>
			<p class="lead">Relationship of people's feeling on Twitter in
				August 2009.</p>
		</div>

		<hr>

		<script type="text/javascript">
			$(function() {
				$('#container').highcharts(
						{
							chart : {
								type : 'line',
								marginRight : 130,
								marginBottom : 40
							},
							title : {
								text : 'August 2009 Feelings',
								x : -20
							//center
							},
							subtitle : {
								text : 'Twitter Analyzer',
								x : -20
							},
							xAxis : {
								categories : [ '31 Jul', '1 ', '2 ', '3 ',
										'4 ', '5 ', '6 ', '7 ', '8 ', '9 ',
										'10 ', '11 ', '12 ', '13 ', '14 ',
										'15 ', '16 ', '17 ', '18 ', '19 ',
										'20 ', '21 ', '25 ', '26 ', '27 ',
										'28 ', '29 ', '30 Aug' ]
							},
							yAxis : {
								title : {
									text : 'Score'
								},
								plotLines : [ {
									value : 0,
									width : 1,
									color : '#808080'
								} ]
							},
							legend : {
								layout : 'vertical',
								align : 'right',
								verticalAlign : 'top',
								x : -10,
								y : 100,
								borderWidth : 0
							},
							series : [ {
								name : 'Warriner Ratings',
								data : [
		<%=sOld%>
			]
							}, {
								name : 'New Lexic Ratings',
								data : [
		<%=sNew%>
			]
							} ]
						});
			});
		</script>

		<div class="row-fluid marketing">
			<div class="hero-unit">
				<div id="container"
					style="min-width: 400px; height: 400px; margin: 0 auto"></div>
			</div>
		</div>

		<hr>

		<div class="footer">
			<p>&copy; SW - MIW - UNIOVI 2013</p>
		</div>

	</div>
	<!-- /container -->

</body>
</html>