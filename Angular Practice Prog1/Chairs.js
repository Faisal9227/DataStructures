var popsugar = angular.module('popsugar', []);

popsugar.controller('popsugarctrl', ['$scope', '$interval', function($scope, $interval) {
var chairs=100;
  $scope.init = function() {
    $scope.chaircircle = [];
    for (var i = 1; i <= chairs; i++) {
        $scope.chaircircle.push({
        index: i						// Assigning numbers to chairs
        });
    }
  };
  $scope.removechairs = function() {
		  chairs=($scope.chairs==null)?100:$scope.chairs;
      $scope.init();
      
    var toRemove = 0, // Chair to be removed
      toSkip = 0; // Chairs to be skipped 

    if ($scope.chaircircle.length >= 1) { // Restart
      $interval.cancel(iterations); 
      $scope.Winner = false; 
			$scope.init();
      }

    var iterations = $interval(function() {

      $scope.disableStartButton = true;

      if ($scope.chaircircle.length > 1) {

        $scope.chaircircle.splice(toRemove, 1); // Removing the chairs 
        toSkip += 1; // toSkip variable incremented in each iteration to ensure the proper number of chairs are skipped
        toRemove += toSkip;

        //if toRemove becomes greater than total number of chairs in circle
        if (toRemove > $scope.chaircircle.length) {
          toRemove %= $scope.chaircircle.length;
        }

      } else {
        $interval.cancel(iterations); // stop the interval
        $scope.Winner = true; // show the winner
        $scope.disableStartButton = false;
        chairs=100;
      }
    }, 100);
  };

}]);