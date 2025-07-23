/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let seen = new Set()
    let l = 0
    let res = 0
    
    for (let r = 0; r < s.length; r++){
        
        //shrinking
        while ( seen.has(s[r]) ){            
            seen.delete(s[l])
            
            l++

            res = Math.max(res, r - l + 1)

        }
        
        //expanding
        seen.add(s[r])
    }
    
    return res
};


console.log(lengthOfLongestSubstring(" "))
