class Profile
{
	String userName;
	String password;
	String bio;
	long no_of_followers;
	String profile_picture;
	String account_type;
	
	public Profile(String userName, String password, String bio, long no_of_followers, String profile_picture, String account_type){
		this.userName = userName;
		this.password = password;
		this.bio = bio;
		this.no_of_followers = no_of_followers;
		this.profile_picture = profile_picture;
		this.account_type = account_type;
	}
	
	public void display(){
		System.out.println(userName);
		System.out.println(password);
		System.out.println(bio);
		System.out.println(no_of_followers);
		System.out.println(profile_picture);
		System.out.println(account_type);
		System.out.println("-------------------------------");
	}
}

class ProfileMain
{
	public static void main(String [] args)
	{
		Profile p1 = new Profile("me.satya2000", "jhieu34#", "hello i am satya", 2344L, "www.me.satya2000.com", "public");
		p1.display();
		
		Profile p2 = new Profile("saytjit", "ijjjeud2345@", "hiii there i am dash fellow", 3400L, "www.sdjfiejfil.com", "private");
		p2.display();
	}
}