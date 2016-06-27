package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.db.jpa.Blob;
import play.db.jpa.Model;
import play.Logger;

@Entity
public class Comment extends Model {

	public int ID;
	public String content;
	public String title;
	
	public Comment(int ID, String content, String title)
	{
		this.ID = ID;
		this.content = content;
		this.title = title;
		}
}

	//public static User findByEmail(String email) {
	//	return find("email", email).first();
	//}


