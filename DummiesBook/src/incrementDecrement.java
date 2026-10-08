class incrementDecrement{
    public static void main(String[] args){
        int i = 10;
        System.out.println(i++);        // print 10 i = 11
        System.out.println(--i);        // print 10 i = 10
        --i;
        i--;                            // i = 8
        System.out.println(i);          //print 8
        System.out.println(++i);        // print 9
        System.out.println(i--);        //print 9 i = 8
        System.out.println(i);          //print 8
        i++;                            //i = 9
        i = i++ + ++i;                  //i = 9 + 11
        System.out.println(i);          //i =20
        i = i++ + ++i;                  //i = 20 + 22
        System.out.println(i);
    }
}