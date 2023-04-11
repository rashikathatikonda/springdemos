<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<html>
<head>
<title>Rashika's Sporty Shoes</title>
</head>
<body align="center" bgcolor="White">

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

</body>
</html>