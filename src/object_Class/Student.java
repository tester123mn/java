package object_Class;

import java.util.Objects;

public class Student {
	String sname;
	int sid;
	int mark;

	Student() {
	}

	public Student(String sname, int sid, int mark) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.mark = mark;
	}

	public String toString() {
		return "Student name=" + this.sname + " Sid=" + this.sid + " Mark=" + this.mark;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.sname.equals(s.sname) && this.sid == s.sid && this.mark == s.mark) {
			return true;
		}
		return false;
	}

	public int hashcode() {
		return Objects.hash(sname, sid, mark);
	}

}
