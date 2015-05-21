'use strict'

/**
 * app.js
 */

var sampleApp = angular.module('sampleApp', []);

sampleApp.config(['$routeProvider', function($routeProvider) {

	$routeProvider.when('/update/:courseId', {
		templateUrl: 'update_view.html',
		controller: 'UpdateController'
	}).when('/delete/:courseId', {
		templateUrl: 'delete_course.html',
		controller: 'DeleteController'
	}).when('/home', {
	}).when('/add', {
		templateUrl: 'add_course.html',
		controller: 'AddController'
	}).otherwise({
		redirectTo: '/home'
	});

}]);

sampleApp.service('serviceMethods',function($http, $q){
	var deferred = $q.defer();

	/*this.fetchCourseList = function(){*/
		//$http.defaults.useXDomain = true;
		/*$http.get('http://localhost:8090/Student-Portal/login/fetchCourses').success(function(data){
		  courseList.content = [{"courseId":3,"courseName":"English","courseNumber":"ENG001"},{"courseId":4,"courseName":"Maths","courseNumber":"MTH001"}];
	    }).error(function(){
	  	  alert("Error");
	    });*/
		/*$http.get('http://localhost:8090/Student-Portal/login/fetchCourses').then(function(result){
			deferred.resolve(result);
		});
	};*/

    this.fetchCourseList = function(){
		var request = $http({
			method: "get",
			url: "http://localhost:8090/Student-Portal/login/fetchCourses"
		});
		return request;
	}              
                  
	this.getCourseList = function(){
		return deferred.promise;
	}

	this.deleteCourse = function(id){
		var request = $http({
			method: "delete",
			url: "http://localhost:8090/Student-Portal/delete/deleteCourse",
			params: {courseId: id}
		});
		return request;
	}

	this.updateCourse = function(jsonData){
		var request = $http({
			method: "post",
			url: "http://localhost:8090/Student-Portal/update/updateCourse",
			data: jsonData
		});
		return request;
	}
    
    this.addCourse = function(jsonData){
        var request = $http({
                method: "put",
                url: "http://localhost:8090/Student-Portal/add/addCourse",
                data: jsonData
        });
        return request;
    }
});