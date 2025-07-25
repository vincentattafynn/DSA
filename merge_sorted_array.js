/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(nums1, m, nums2, n) {
    let p1 = m - 1
    let p2 = n - 1
    let p3 = m + n - 1 
    nums1_copy = [...nums1];
    
    
    while (p3 >= 0 ){
        // if ( p2 == undefined && p1 == undefined){
            
        // } 
        console.log('p3: ', p3)
        console.log('p1: ', p1)
        console.log('p1 value: ', nums1_copy[p1])
        console.log('p2: ', p2)
        console.log('p2 value: ', nums2[p2])
        console.log('nums1_copy: ',nums1_copy)
        console.log('nums1: ',nums1)
        
        if ( nums1_copy[p1] == nums2[p2] ){
            nums1[p3] = nums2[p2];
            p2--
        }else if(nums1_copy[p1] > nums2[p2] || p2 < 0 || p2 === undefined){
            nums1[p3] = nums1_copy[p1];
            p1--
        }else if(nums2[p2] > nums1_copy[p1] || p1 < 0 || p1 === undefined){
            nums1[p3] = nums2[p2];
            p2--
        }
        
        
        console.log('Number picked: ', nums1[p3])
        console.log('-----')
        p3--;
    }
    
    return nums1
};

console.log(merge([0],0,[1],1))
