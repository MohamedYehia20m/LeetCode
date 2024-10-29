/**
 * @param {string} val
 * @return {Object}
 */
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        toBe: (data)=>{
            if (val === data) return true;
            throw new Error('Not Equal')
        },
        notToBe: (data)=>{
            if (val !== data) return true;
            throw new Error('Equal')
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */