class Concatination
{
    public static void main(String [] args){
        // number + number ----> number
        System.out.println(10+10); // 20
        
        // number + char ----> number
        System.out.println(10 + 'a'); // 10 + 97

        // character + character ----> nmber
        System.out.println('a' + 'a'); // 97 + 97 =194

        // number + boolean ----> // CTE
        // System.out.println('a' + true);

        // number + string ----> Concatination
        System.out.println(10+ "sheela");//10sheela
        System.out.println(10+20+"sheela");//30sheela
        System.out.println("sheela"+"laila");//sheelalaila
        System.out.println(20+10+'a'+"sheela"); // 127sheela
        System.out.println(10+"abc"+"sheela"+20); // 10abcsheela20
        System.out.println(10+"sheela"+20+30); // 10sheela2030
        System.out.println(10+"sheela"+(20+30)+"laila"); // 10sheela50laila
        System.out.println(20+"sheela"+'a'+'c'+20); // 20sheelaac20
    }
}