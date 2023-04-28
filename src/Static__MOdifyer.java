public class Static__MOdifyer {
    public static void main(String[] args){

        // static = modifier. A single copy of a variable/method is created and shared.
        // The class "owns" the static member

        Friend dan = new Friend("Dan");

       System.out.println(Friend.numberOfFriends);
       System.out.println(dan.name);
    }
}
