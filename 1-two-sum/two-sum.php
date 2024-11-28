class Solution {

    /**
     * @param Integer[] $nums
     * @param Integer $target
     * @return Integer[]
     */
    function twoSum($nums, $target) { 
        $op = array();
        for($i =0; $i<count($nums);$i++){
            $find = $target-$nums[$i];
            if(array_search($find,$nums)!== false){
                $key = array_search($find,$nums);
                if($i !=$key){
                    array_push($op,$i,$key);
                    break;
                }
            }
        }
        return $op;
        
    }
}