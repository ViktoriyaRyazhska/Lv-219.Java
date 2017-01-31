<form method="post"
	action="${pageContext.request.contextPath}/reserveHotel">
	<label for="firstName">First Name:</label> <input type="text"
		id="firstName" name="firstName" placeholder="Enter First Name" /> <br />
	<br /> <label for="lastName">Last Name</label> <input type="text"
		id="lastName" name="lastName" placeholder="Enter Last Name" /> <br />
	<br /> <label for="country">Country</label> <input type="text"
		id="country" name="country" placeholder="Enter Country" /> <br /> <br />
	<label for="city">City</label> <input type="text" id="city"
		name="city" placeholder="city" /> <br /> <br /> <label for="date">Date:</label>
	<input type="text" id="date" name="date"
		placeholder="Enter date(yyyy-mm-dd)" /> <br /> <br /> <input
		type="submit" value="send" />

</form>