package codility.timecomplexity;

class TapeEquilibrium {


    int solution(int[] A) {
        if(A.length==2){
            return Math.abs(A[0]-A[1]);
        }

        int leftSum = A[0];
        int rightSum = 0;

        for(int i = 1; i < A.length; i++) {
            rightSum+=A[i];
        }

        int result = Math.abs(leftSum - rightSum);

        for(int i = 1; i < A.length-1; i++){
            leftSum+=A[i];
            rightSum-=A[i];
            int tmpResult = Math.abs(leftSum-rightSum);
            if(tmpResult<result){
                result=tmpResult;
            }
        }

        return result;
    }
}
