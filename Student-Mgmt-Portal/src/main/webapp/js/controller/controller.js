'use strict';

var DeleteController = function($scope, $routeParams, serviceMethods){
	$scope.courseId = $routeParams.courseId;
	var request = serviceMethods.deleteCourse( $scope.courseId );
	request.success(function(data, status, headers, config) {
		$scope.message = data.data;
        $scope.loadCourses();
	});
};

var UpdateController = function($scope, $routeParams, serviceMethods){
	$scope.courseId = $routeParams.courseId;
	$scope.updateCourse = function(){
        var dataObj = {
				courseId : $scope.course.courseId,
				courseName : $scope.course.courseName,
				courseNumber : $scope.course.courseNumber
		};
        //console.log("Data is : " + JSON.stringify(dataObj));
        var request = serviceMethods.updateCourse(JSON.stringify(dataObj));
	    request.success(function(data, status, headers, config) {
		  //console.log(data);
          $scope.message = data.data;
          $scope.cnfmUpdate = data.status;
          $scope.loadCourses();
	    });
    }
};

var AddController = function($scope, $routeParams, serviceMethods){
	$scope.addCourse = function(){
        /* while compiling form , angular created this object*/
        var dataObj=$scope.course;  
        //console.log("Data is : " + JSON.stringify(dataObj));
        var request = serviceMethods.addCourse(JSON.stringify(dataObj));
	    /*if(request === undefined || request === null){
            $scope.message = "Error while adding user";
            $scope.cnfmAdd = false;
        }else{*/
            request.success(function(data, status, headers, config) {
              console.log(data);
              $scope.message = data.data;
              $scope.cnfmAdd = data.status;
              $scope.loadCourses();
            });
            request.error(function(data, status, headers, config) {
              console.log(status);
              $scope.message = status;
              $scope.cnfmAdd = false;
            });
        //}
    }
};

var OrderController = function($scope, $routeParams, $route, serviceMethods, $http, $location){
	$scope.courseId = $routeParams.courseId;
	$scope.courseList = [];

    $scope.loadCourses = function(){
        var request = serviceMethods.fetchCourseList();
	    request.success(function(data, status, headers, config) {
		  //console.log(data.data);
          $scope.courseList = data.data; 
	    });
    }
    
    $scope.loadCourses();
    
    $scope.showAddCourse = function(){
        $location.url("/add");
    }
    
	/*serviceMethods.fetchCourseList();
	var promise = serviceMethods.getCourseList();
	promise.then(function(result) {
		//console.log("list is :" + JSON.stringify(result.data.data));
		$scope.courseList = result.data.data;
	});*/
};

