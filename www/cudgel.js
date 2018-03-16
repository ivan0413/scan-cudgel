var exec = require('cordova/exec');
var cudgel = function(){};
cudgel.prototype.doSame = function(arg,success,error) {
  exec(success, error, "cudgel", "mydream", [arg]);
};
var cgel = new cudgel();
module.exports = cgel;