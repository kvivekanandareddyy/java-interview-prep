public class mazesub {
    public static void main(String[] args) {
        boolean[][] ans = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        obsat("" ,ans , 0 , 0);
    }

    static void obsat(String p , boolean[][] path , int r , int c){
        if(r == path.length - 1 && c == path[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!path[r][c]){
            return;
        }

        if(r < path.length - 1){
            obsat(p + 'D' , path , r + 1, c);
        }

        if(c < path[0].length - 1){
            obsat(p + "R" , path , r , c + 1);
        }
        if(r < path.length - 1 && c < path[0].length - 1 ){
            obsat(p + 'I' , path , r + 1 , c + 1);
        }
    }


}

