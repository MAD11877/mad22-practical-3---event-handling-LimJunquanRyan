package sg.edu.np.mad.madpractical2;

public class User {
    String name;
    String description;
    int id;
    boolean followed;

    public User(String n, String d, int i, boolean f) {
        name = n;
        description = d;
        id = i;
        followed = f;
    }
}
