var exec = require('cordova/exec');
var CLASS = 'CheckHuaweiServices';

module.exports = {
    checkHuaweiServicesAvailability: function (onSuccess, onError) {
        exec(onSuccess, onError, CLASS, 'checkHuaweiServicesAvailability', []);
    }
}
