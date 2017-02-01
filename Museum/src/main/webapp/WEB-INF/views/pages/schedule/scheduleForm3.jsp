<form method="post" action="${pageContext.request.contextPath}/countOfExcursions">
	<label for="dateStart">DateStart:</label>
	<input type="text" id="dateStart" name="dateStart" placeholder="Enter dateStart(yyyy-mm-dd hh:mm)" /> <br />
	<br />
	<label for="dateEnd">DateEnd:</label>
	<input type="text" id="dateEnd" name="dateEnd" placeholder="Enter dateEnd(yyyy-mm-dd hh:mm)" /> <br />
	<input type="submit" value="send" />
</form>