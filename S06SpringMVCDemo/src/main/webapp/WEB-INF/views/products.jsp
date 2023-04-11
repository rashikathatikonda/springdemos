<%@ page language="java" contentType="text/html" isELIgnored="false"%>

<html>

<head>

<title>Rashika's Sporty Shoes</title>

</head>

<body>

<h1>Manage Products</h1>

<form action="products" method="post">

<pre>

Name:<input type="text" name="name"/>

Description:<input type="text" name="Description"/>

Price:<input type="text" name="price"/>

<input type="submit" name="submit"/>

</pre>

</form>

<H1>List of Products </H1>

	<form action="products" method="post">
		<table border="1"
			>
			<tr>
				<th>Id</th>
				<th>ProductName</th>
				<th>Category</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>

					<td>${product.name}</td>

					<td>${product.description}</td>

					<td>${product.price}
					<td>
				</tr>
			</c:forEach>
		</table>

	</form>

</body>

</html>

