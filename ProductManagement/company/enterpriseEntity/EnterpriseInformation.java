package enterpriseEntity;

public class EnterpriseInformation {
           private int id;
           private String name;
           private String gender;
           private int age;
           private String education;
           
        public EnterpriseInformation() {
        	
        }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		public String toString() {
			return "["+this.id+","+this.name+","+
		this.gender+","+this.age+","+this.education+"]";
		}
           
}
