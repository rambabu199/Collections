
/*
You're tasked with developing a simplified social media application that tracks user interactions. Users can follow each other, like posts, and comment on posts. To efficiently manage these interactions, you decide to use HashSet to store the data.

Question:

Design a Java program that simulates user interactions using HashSet. Create three classes: User, Post, and SocialMediaApp.

User class should have:
userId: An integer representing the user's ID.
username: A string representing the user's username.
followedUsers: A HashSet of integers to store the IDs of users that this user follows.
Implement a constructor to initialize userId and username.
Implement a method follow(User user) to allow the user to follow another user.
Implement a method unfollow(User user) to allow the user to unfollow another user.
Post class should have:
postId: An integer representing the post's ID.
content: A string representing the content of the post.
likedUsers: A HashSet of integers to store the IDs of users who liked this post.
Implement a constructor to initialize postId and content.
Implement a method like(User user) to allow a user to like the post.
SocialMediaApp class should have the main method to demonstrate the interactions:
Create several User and Post objects.
Simulate users following and unfollowing each other.
Simulate users liking posts.

Ensure that you use HashSet effectively to store the interactions and avoid duplicates.

*/
import java.util.*;

class User {
  int userid;
  String name;
  HashSet<Integer> followedusers;

  User(int userid, String name) {
    this.userid = userid;
    this.name = name;
    this.followedusers = new HashSet<Integer>();
  }

  public int getUserId() {
    return userid;
  }

  public void follow(User user) {
    followedusers.add(user.userid);
  }

  public void unfollow(User user) {
    followedusers.remove(user.userid);
  }

  public String getUserName() {
    return name;
  }

  public void diplayfollwers() {
    System.out.println("displayomg the follwers");
    Iterator itr = followedusers.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}

class Post {
  int postid;
  String content;
  HashSet<Integer> likes;

  Post(int postid, String content) {
    this.postid = postid;
    this.content = content;
    this.likes = new HashSet<Integer>();
  }

  public void like(User user) {
    likes.add(user.getUserId());
  }

  public void display() {
    System.out.println("the liked users of the post");
    Iterator itr = likes.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}

class SocialMediaApp {
  public static void main(String args[]) {
    Post p1 = new Post(1, "welcome");
    Post p2 = new Post(2, "hello bitlabs");
    Post p3 = new Post(3, "introduction to java");
    User u1 = new User(1, "ram");
    User u2 = new User(2, "babu");
    User u3 = new User(3, "syam");
    User u4 = new User(4, "ramu");
    p1.like(u1);
    p1.like(u2);
    p2.like(u3);
    p1.like(u4);
    p3.like(u2);
    p3.like(u3);
    u1.follow(u2);
    u1.follow(u4);
    u2.follow(u1);
    u2.follow(u3);
    u3.follow(u1);
    u3.follow(u2);
    u4.follow(u1);
    u4.follow(u2);
    u4.follow(u3);
    u1.diplayfollwers();
    u2.diplayfollwers();
    u3.diplayfollwers();
    u4.diplayfollwers();
    p1.display();
    p2.display();
    p3.display();
  }
}
