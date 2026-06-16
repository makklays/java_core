/**
 * company: TechMatrix18
 * author: Alexander Kuziv 
 * date: 01.05.2026
 */

/**
 * Class UserDAO
 */

class UserDAO 
{
  void UserDAO() {}

  private boolean InsertUser(User user) {
    // insert
  }

  private boolean UpdateUser(User user) {
    // update 
  } 

  private boolean DeleteUser(User user) {
    // delete
  }

  public String getUserInfo() {
        return "User {" +
            "id=" + id +
            ", login='" + login + '\'' +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", password='" + password + '\'' +
            ", gender='" + gender + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", city='" + city + '\'' +
            ", auth_at='" + isAuth + '\'' +
            ", code='" + code + '\'' +
            ", created_at='" + createdAt + '\'' +
            ", updated_at=" + updatedAt +
        '}';
    }
}


//

