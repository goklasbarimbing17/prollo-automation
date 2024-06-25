Feature: Login Page

  Scenario Outline: Check access url login page
    Given Input url web prollo "<Url>"
    Then Menampilkan halaman login "<TxtLoginPage>"
    Examples:
      | Url                                                  | TxtLoginPage |
      | https://dev.dikahadir.com/xpipe/authentication/login | Prolog      |

  Scenario Outline: Check login page
    When User input nik "<Nik>"
    And User input password "<Password>"
    And Klik tombol Sign In
    Then Berhasil login dan menampilkan halaman dashboard "<msgResult>" "<case>"

    Examples:
      | Nik      | Password | msgResult                                          | case                 |
#      | D6211234 | 123      | nik atau password anda salah                       | invalid nik          |
#      | D6211116 | 4567Aji  | nik atau password anda salah                       | invalid password     |
#      |          | 123      | NIK tidak boleh kosong                             | nik empty            |
#      | D6211116 |          | Password tidak boleh kosong                        | password empty       |
#      |          |          | NIK tidak boleh kosong Password tidak boleh kosong | password & nik empty |
      | D6211116 | 123      | Prolog                                             | valid login          |
