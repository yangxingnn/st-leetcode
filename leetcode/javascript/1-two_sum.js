/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
            var temp = {};
            var result = [];
            nums.forEach(function(item,index,nums){
                if(temp[item]!==undefined){
                    result= [temp[item],index];
                }
                temp[target-item] = index;
            });
            return result;
        };