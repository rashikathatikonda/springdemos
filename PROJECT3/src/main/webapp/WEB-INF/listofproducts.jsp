
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reguest</title>
</head>
<body>
	<form action="products" method="post">
		<h1>
			<center>Manage Products</center>
		</h1>
		<table border="1"
			style="border: 1px solid black; margin-left: auto; margin-right: auto;">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input type="text" name="des"></td>
			</tr>

			<tr>
				<td>Price:</td>
				<td><input type="text" name="price"></td>
			</tr>
		</table>

		<center>
			<input type="submit" name="Add product">
		</center>
	</form>


	<table border="1"
		style="border: 1px solid black; margin-left: auto; margin-right: auto;">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>

				<td>${product.name}</td>

				<td>${product.des}</td>

				<td>${product.price}
				<td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>