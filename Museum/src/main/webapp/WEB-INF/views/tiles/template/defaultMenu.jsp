<nav>
	<div class="dropdown">
  		<button class="dropbtn">Home</button>
  		<div class="dropdown-content">
    		<a href="${pageContext.request.contextPath}/">Home</a>
  		</div>
	</div>
	<div class="dropdown">
  		<button class="dropbtn">Exhibits</button>
  		<div class="dropdown-content">
    		<a href="${pageContext.request.contextPath}/showExhibits">List of exhibits</a>
    		<a href="${pageContext.request.contextPath}/exhibitForm1">Find exhibits by author</a>
    		<a href="${pageContext.request.contextPath}/exhibitForm2">Find exhibits by worker</a>
    		<a href="${pageContext.request.contextPath}/showExhibitsByHall">Find exhibits by hall</a>
    		<a href="${pageContext.request.contextPath}/exhibitsStatistic">Exhibits statistics</a>
  		</div>
	</div>
	<div class="dropdown">
  		<button class="dropbtn">Workers</button>
  		<div class="dropdown-content">
    		<a href="${pageContext.request.contextPath}/workerForm">Find workers by post</a>
  		</div>
	</div>
	<div class="dropdown">
  		<button class="dropbtn">Schedule</button>
  		<div class="dropdown-content">
    		<a href="${pageContext.request.contextPath}/scheduleForm1">Find excursions</a>
    		<a href="${pageContext.request.contextPath}/scheduleForm2">Show guides statistics</a>
    		<a href="${pageContext.request.contextPath}/scheduleForm3">Count of excursions</a>
  		</div>
	</div>
</nav>