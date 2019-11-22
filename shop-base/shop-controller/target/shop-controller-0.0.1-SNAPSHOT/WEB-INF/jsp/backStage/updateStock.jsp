<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<link href="css/bootstrap.css" rel="stylesheet" />
		<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
		<link href="css/custom-styles.css" rel="stylesheet" />
		<link href="css/font-awesome.css" rel="stylesheet" />
		<link href="js/morris/morris-0.4.3.min.css" rel="stylesheet" />
		<script src="js/bootstrap.js"></script>
		<title>更新库存</title>
		
		<!-- JS Scripts-->
		<!-- jQuery Js -->
		<script src="js/jquery-1.10.2.js"></script>
		<!-- Bootstrap Js -->
		<script src="js/bootstrap.min.js"></script>
		<!-- Metis Menu Js -->
		<script src="js/jquery.metisMenu.js"></script>
		<!-- Morris Chart Js -->
		<script src="js/morris/raphael-2.1.0.min.js"></script>
		<script src="js/morris/morris.js"></script>
		<!-- Custom Js -->
		<script src="js/custom-scripts.js"></script>
	</head>
	<body>
		<div id="wrapper">
		    <%@ include file="header.jsp" %>
	        <!--/. NAV TOP  -->
	        <%@ include file="left.jsp" %>
		    
		    <div id="page-wrapper">
		        <div id="page-inner">
		
		
		            <div class="row">
		                <div class="col-md-12">
		                    <h1 class="page-header">更新库存</h1>
		                </div>
		            </div>
		         
			<div class="panel panel-default">
				<div class="panel-body">
					<table class="table table-striped ">
						<thead >
							<th width="200px">商品名称</th>
							<th width="200px">规格</th>
							<th width="200px">数量</th>
						</thead>
    	<tbody >
    		
    	<form id="loginform" action="${pageContext.request.contextPath}/backstage/updateStockBackStage" method="post" >
    		<tr class="selete">
    		${msg6}
    			<td>
    				${pname}
    				<input type="hidden" name="psId" value="${productSpec.psId}">
    				<input type="hidden" name="pid" value="${productSpec.pid}">
    			</td>
    			<td>
					<select name="psSpec" class="form-control">
						<option value="21" ${productSpec.psSpec == '21'?"selected='selected'":"" }>21</option>
						<option value="22" ${productSpec.psSpec == '22'?"selected='selected'":"" }>22</option>
						<option value="23" ${productSpec.psSpec == '23'?"selected='selected'":"" }>23</option>
						<option value="24" ${productSpec.psSpec == '24'?"selected='selected'":"" }>24</option>
						<option value="25" ${productSpec.psSpec == '25'?"selected='selected'":"" }>25</option>
						<option value="26" ${productSpec.psSpec == '26'?"selected='selected'":"" }>26</option>
						<option value="27" ${productSpec.psSpec == '27'?"selected='selected'":"" }>27</option>
						<option value="28" ${productSpec.psSpec == '28'?"selected='selected'":"" }>28</option>
						<option value="29" ${productSpec.psSpec == '29'?"selected='selected'":"" }>29</option>
						<option value="30" ${productSpec.psSpec == '30'?"selected='selected'":"" }>30</option>
						<option value="31" ${productSpec.psSpec == '31'?"selected='selected'":"" }>31</option>
						<option value="32" ${productSpec.psSpec == '32'?"selected='selected'":"" }>32</option>
						<option value="33" ${productSpec.psSpec == '33'?"selected='selected'":"" }>33</option>
						<option value="34" ${productSpec.psSpec == '34'?"selected='selected'":"" }>34</option>
						<option value="35" ${productSpec.psSpec == '35'?"selected='selected'":"" }>35</option>
						<option value="36" ${productSpec.psSpec == '36'?"selected='selected'":"" }>36</option>
						<option value="37" ${productSpec.psSpec == '37'?"selected='selected'":"" }>37</option>
						<option value="38" ${productSpec.psSpec == '38'?"selected='selected'":"" }>38</option>
						<option value="39" ${productSpec.psSpec == '39'?"selected='selected'":"" }>39</option>
						<option value="40" ${productSpec.psSpec == '40'?"selected='selected'":"" }>40</option>
						<option value="41" ${productSpec.psSpec == '41'?"selected='selected'":"" }>41</option>
						<option value="42" ${productSpec.psSpec == '42'?"selected='selected'":"" }>42</option>
						<option value="43" ${productSpec.psSpec == '43'?"selected='selected'":"" }>43</option>
						<option value="44" ${productSpec.psSpec == '44'?"selected='selected'":"" }>44</option>
					</select>
				</td>
				<td><input class="btn btn-default" type="text" name="psStore" placeholder="数量" value="${productSpec.psStore}" /></td>
    			<td>
    				<input class="btn btn-default" type="submit"  value="修改">
    				<a href="javascript:void(0)" onclick="history.go(-1)" class="btn btn-danger">返回</a> 
    			</td>
    		</tr>
    	</form>
    	</tbody>
    	</table>
				</div>
			</div>
     
		    </div>
		    <!-- /. PAGE WRAPPER  -->
		</div>
	</body>
</html>
