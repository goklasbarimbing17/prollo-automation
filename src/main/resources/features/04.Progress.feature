Feature: Progress Page

  Scenario: Show Progress Page
    When go to menu process
    Then validate progress page

#  Scenario: Show activity page
#    When go to menu process
#    And click button activity prospect
#    Then validate activity page

#  Scenario: Drag prospect to share compro
#    When drag card to share compro
#    Then validation displays the share compro form
#
#  Scenario Outline: Input form Share compro
#    When input company name "<Company Name>"
#    And input product name "<Product Name>"
#    And input project name "<Project Name>"
#    And input company address "<Company Address>"
#    And input type of business "<Type of business>"
#    And input PIC name "<PIC name>"
#    And input telephone number PIC "<no telp PIC>"
#    And input email PIC "<Email PIC>"
#    And select source <Source>
#    And click button create
#    Then validate input form "<Status>" "<Result>"
#
#    Examples: Data table Add Client
#      | Company Name | Product Name | Project Name     | Company Address                           | Type of business | PIC name     | no telp PIC | Email PIC         | Source | Status           | Result                               |
#      |              | ICT DUMMY    | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Company Name     | Nama Perusahaan tidak boleh kosong   |
#      | PT DUMMY TBK |              | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Product Name     | Nama Usaha tidak boleh kosong        |
#      | PT DUMMY TBK | ICT DUMMY    |                  | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Project Name     | Nama Project Harus Diisi!            |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy    |                                           | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Company Address  | Alamat Perusahaan tidak boleh kosong |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan |                  | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Type Of Business | Tipe Usaha tidak boleh kosong        |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         |              | 08756453123 | dummmy1@gmail.com | 3      | Pic Name         | Nama PIC tidak boleh kosong          |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra |             | dummmy1@gmail.com | 3      | Telp Pic         | Nomor Telp. PIC tidak boleh kosong   |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 0      | Source           | Source tidak boleh kosong            |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy 25 | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Duplicate        | Data is duplicate                    |
#      | PT DUMMY TBK | ICT DUMMY    | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 4      | Success          | Sukses menambahkan Client            |
#
#  Scenario: View detail Share Compro
#    When click view detail share compro
#    Then validation display the detail share compro
#
#  Scenario: Access edit data share compro
#    When click button edit share compro
#    Then validation display the edit share compro form

#  Scenario Outline: Edit form Share compro
#    When edit company name "<Company Name>"
#    And edit product name "<Product Name>"
#    And edit project name "<Project Name>"
#    And edit company address "<Company Address>"
#    And edit type of business "<Type of business>"
#    And edit PIC name "<PIC name>"
#    And edit telephone number PIC "<no telp PIC>"
#    And edit email PIC "<Email PIC>"
#    And edit source <Source>
#    And click button save edit share compro
#    Then validate edit form share compro "<Status>" "<Result>"
#
#    Examples: Data table Edit Client
#      | Company Name | Product Name   | Project Name     | Company Address                           | Type of business | PIC name     | no telp PIC | Email PIC         | Source | Status           | Result                               |
#      |              | ICT DUMMY EDIT | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Company Name     | Nama Perusahaan tidak boleh kosong   |
#      | PT DUMMY TBK |                | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Product Name     | Nama Usaha tidak boleh kosong        |
#      | PT DUMMY TBK | ICT DUMMY EDIT |                  | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Project Name     | Nama Project Harus Diisi!            |
#      | PT DUMMY TBK | ICT DUMMY EDIT | Project Dummy    |                                           | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Company Address  | Alamat Perusahaan tidak boleh kosong |
#      | PT DUMMY TBK | ICT DUMMY EDIT | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan |                  | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Type Of Business | Tipe Usaha tidak boleh kosong        |
#      | PT DUMMY TBK | ICT DUMMY EDIT | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         |              | 08756453123 | dummmy1@gmail.com | 3      | Pic Name         | Nama PIC tidak boleh kosong          |
#      | PT DUMMY TBK | ICT DUMMY EDIT | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra |             | dummmy1@gmail.com | 3      | Telp Pic         | Nomor Telp. PIC tidak boleh kosong   |
#      | PT DUMMY TBK | ICT DUMMY EDIT | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 0      | Source           | Source tidak boleh kosong            |
#      | PT DUMMY TBK | ICT DUMMY      | Project Dummy 25 | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 3      | Duplicate        | Data is duplicate                    |
#      | PT DUMMY TBK | ICT DUMMY EDIT | Project Dummy    | Tebet timur dalam, Tebet, Jakarta Selatan | Produksi         | Noviar Putra | 08756453123 | dummmy1@gmail.com | 4      | Success          | Success edit form                    |


#  Scenario: Drag share compro to initial meetings
#    When drag card to initial meetings
#    Then validation displays the initial meetings form
#
#  Scenario Outline: Input form Initial Meetings
#    When input subject meeting "<subject>"
#    And input location meeting "<location>"
#    And input participants "<participants>"
#    And input tanggal dan jam "<date>"
#    And input notes "<notes>"
#    And click button create initial meetings
#    Then validate input form initial meetings "<status>" "<result>"
#
#    Examples: Data table input form Initial meetings
#      | subject         | location        | participants       | date     | notes                           | status             | result                                       |
#      |                 | Jakarta Selatan | dummy123@gmail.com | 03122024 | Meeting dilakukan secara onside | subject empty      | name is a required field                     |
#      | Meeting Pertama |                 | dummy123@gmail.com | 03122024 | Meeting dilakukan secara onside | location empty     | location is a required field                 |
#      | Meeting Pertama | Jakarta Selatan |                    | 03122024 | Meeting dilakukan secara onside | participants empty | participant field must have at least 1 items |
#      | Meeting Pertama | Jakarta Selatan | dummy123@gmail.com |          | Meeting dilakukan secara onside | date empty         | date is a required field                     |
#      | Meeting Pertama | Jakarta Selatan | dummy123@gmail.com | 03122024 | Meeting dilakukan secara onside | complete           | Sukses menambahkan Initial Meeting           |
#
#  Scenario: View detail Initial Meetings
#    When click view detail initial meetings
#    Then validation display the detail initial meetings
#
#  Scenario: Access edit Initial Meetings
#    When click button edit initial meetings
#    Then validation display the edit initial meetings form
#
#  Scenario Outline: Edit Initial Meetings
#    When edit subject meeting "<subject>"
#    And edit location meeting "<location>"
#    And select type of mom <type mom>
#    And input or upload mom "<mom>"
#    And click button save initial meetings
#    Then validate edit initial meetings "<status>" "<result>"
#
#    Examples: Data table input form Initial meetings
#      | subject         | location        | type mom | mom                                                                                  | status                       | result                 |
#      |                 | Jakarta Selatan | 1        | 1. Fitur Login bisa login menggunakan akun dikaone \n 2. Tambahkan fitur remember me | subject empty                | Subject harus diisi!   |
#      | Meeting Pertama |                 | 1        | 1. Fitur Login bisa login menggunakan akun dikaone \n 2. Tambahkan fitur remember me | location empty               | Lokasi harus diisi!    |
#      | Meeting Pertama | Jakarta Selatan | 0        | 1. Fitur Login bisa login menggunakan akun dikaone \n 2. Tambahkan fitur remember me | don't select type upload mom | Tipe MoM harus dipilih |
#      | Meeting Pertama | Jakarta Selatan | 1        |                                                                                      | mom empty                    | MOM harus diinput!     |
#      | Meeting Pertama | Jakarta Selatan | 1        | 12345                                                                                | mom under 10 character       | Minimal 10 Karakter    |
#      | Meeting Pertama | Jakarta Selatan | 1        | 1. Fitur Login bisa login menggunakan akun dikaone \n 2. Tambahkan fitur remember me | complete                     | Success Edit Meeting   |


  #CLIENT ASSESSMENT
  Scenario: Drag initial meeting to client assessment
    When drag card to client assessment
    Then validation displays the client assessment form

  Scenario Outline: Check Field Periode Kerjasama And Lokasi kerja
    When input periode kerjasama <periodKerjasama>
    And input lokasi kerja "<status>"
    Then validate input field "<result>" "<status>"

    Examples: Daata table input periode kerjasama and lokasi kerja
      | periodKerjasama | result                         | status        |
      | 0               | Periode Kerjasama Harus Diisi! | Periode empty |
      | 24              | Lokasi Kerja Harus Disii!      | Lokasi empty  |
      | 24              | Berhasil                       | Success       |

#LABOUR SUPPLY
  Scenario: Ceklis form Labour Supply
    When ceklist jenis kerjasama labour supply
    Then validate the labour supply display form

  Scenario Outline: Coorperation - Labour supply
    When input jumlah TK <jumlahTK>
    And input biaya gaji TK <biayaGaji>
    And input managementFee <managementFee>
    And select sumber ppn <sumberPPN>
    And input ppn <ppn>
    And click button calculate
    Then validate input cooperation labour supply "<status>"

    Examples: data table input client assessment
      | jumlahTK | biayaGaji | managementFee | sumberPPN | ppn | status           |
      | -1       | 3000000   | 7             | 3         | 12  | empty jumlah TK  |
      | 2        | -1        | 7             | 3         | 12  | empty biaya gaji |
      | 0        | 3000000   | 7             | 3         | 12  | jumlah tk <= 0   |
      | 2        | 0         | 7             | 3         | 12  | biaya gaji <= 0  |
      | 2        | 4000000   | 7             | 0         | 12  | empty sumber ppn |
      | 3        | 4500000   | 8             | 2         | 12  | success          |

#JOB SUPPLY
  Scenario: Ceklis form Job Supply
    When ceklist jenis kerjasama job supply
    Then validate the job supply display form

  Scenario Outline: Coorperation - Job Supply
    When input qty target <qtyTarget>
    And input harga per qty <hargaPerQty>
    And pilih ppn job supply <ppn>
    And click button calculate job supply
    Then validate input cooperation job supply "<status>"

    Examples:
      | qtyTarget | hargaPerQty | ppn | status                |
      | -1        | 500000      | 1   | empty qty target      |
      | 2         | -1          | 1   | empty harga per qty   |
      | 0         | 500000      | 1   | qty target under 1    |
      | 3         | 0           | 1   | harga per qty under 1 |
      | 3         | 500000      | 0   | empty ppn             |
      | 2         | 500000      | 2   | does't use ppn        |
      | 2         | 500000      | 1   | success               |

#FACILITY MANAGEMENT
  Scenario: Ceklist form Facility Management
    When checklist jenis kerjasama facility management
    Then validate the facility management display form

  Scenario Outline: Coorperation - Facility Management
    When input qty target facility management <qtyTarget>
    And input harga per qty facility management <hargaPerQty>
    And pilih ppn facility management <ppn>
    And click button calculate facility management
    Then validate input cooperation facility management "<status>" <ppn>

    Examples:
      | qtyTarget | hargaPerQty | ppn | status                |
      | -1        | 500000      | 1   | empty qty target      |
      | 2         | -1          | 1   | empty harga per qty   |
      | 0         | 500000      | 1   | qty target under 1    |
      | 3         | 0           | 1   | harga per qty under 1 |
      | 3         | 500000      | 0   | empty ppn             |
      | 2         | 500000      | 2   | does't use ppn        |
      | 2         | 500000      | 1   | success               |

#RECRUITMENT SERVICE
  Scenario: Checklist form recruitment service
    When checklist jenis kerjasama recruitment service
    Then validate input coorperation recruitment service

  Scenario Outline: Coorperation - Recruitment Service
    When input jumlah tk recruitment service <jumlahTK>
    And input biaya gaji tk recruitment service <biayaGaji>
    And input management fee recruitment service <mFee>
    And click button calculate recruitment service
    Then validate input coorperation recruitment service "<status>"
    Examples:
      | jumlahTK | biayaGaji | mFee | status         |
      | -1       | 3400000   | 8    | amount empty   |
      | 3        | -1        | 8    | salary empty   |
      | 0        | 5100000   | 8    | amount under 1 |
      | 4        | 0         | 11   | salary under 1 |
      | 3        | 3400000   | 12   | success        |

#TRAINING
  Scenario: Checklist form training
    When checklist jenis kerjasama training
    Then validate input coorperation training

  Scenario Outline: Coorperation - Training
    When input qty target training <qtyTarget>
    And input harga per qty training <hargaPerQty>
    And pilih ppn training <ppn>
    And click button calculate training
    Then validate input cooperation training "<status>" <ppn>

    Examples:
      | qtyTarget | hargaPerQty | ppn | status                |
      | -1        | 500000      | 1   | empty qty target      |
      | 2         | -1          | 1   | empty harga per qty   |
      | 0         | 500000      | 1   | qty target under 1    |
      | 3         | 0           | 1   | harga per qty under 1 |
      | 3         | 500000      | 0   | empty ppn             |
      | 2         | 500000      | 2   | does't use ppn        |
      | 2         | 500000      | 1   | success               |

  #FUNDS
  Scenario: Cek value estimated fund
    Then validation fund according to cooperative calculations

  Scenario Outline: cek form funds
    When input payment term <paymentTerm>
    Then check fund turnover month "<status>"
    Then check result fund turn over "<status>"

    Examples:
      | paymentTerm | status                 |
      | 0           | payment term min value |
      | 5           | payment term max value |
      | 1           | payment term 1 value   |
      | 2           | payment term 2 value   |
      | 3           | payment term 3 value   |

#  CLIENT DATA ASSESSMENT
  Scenario Outline: Client Data - General
    When input established year "<year>"
    And input total employees "<totalEmployee>"
    And select office type <officeType>
    Then validate input form CA General "<status>"
    Examples:
      | year | totalEmployee | officeType | status                 |
      |      | 223           | 2          | established year empty |
      | 2012 |               | 2          | total employee empty   |
      | 2014 | 223           | 0          | office type empty      |
      | 2014 | 223           | 2          | success                |

  Scenario Outline: Client Data - Rating Perusahaan
    When select company rating <companyRating>
    Then validate input form CA company rating "<status>"
    Examples:
      | companyRating | status               |
      | 0             | company rating empty |
      | 2             | positive             |

  Scenario Outline: Client Data - Finansial
    When select finansial <finansial>
    Then validate input form CA finansial "<status>"
    Examples:
      | finansial | status          |
      | 0         | finansial empty |
      | 1         | positive        |

  Scenario Outline: Client Data - Legalitas
    When select ojk <ojk>
    And select aftech <aftech>
    And select afpi <afpi>
    Then validate input form ca legalitas "<status>"
    Examples:
      | ojk | aftech | afpi | status       |
      | 0   | 1      | 1    | ojk empty    |
      | 1   | 0      | 1    | aftech empty |
      | 1   | 1      | 0    | afpi empty   |
      | 1   | 1      | 2    | positive     |

  Scenario Outline: Client Data - Informasi lainnya
    When select company owner <companyOwner>
    And input owner name "<status>"
    And input direktur utama
    And input direksi1
    And input direksi2
    And input direksi3
    And select company info <companyInfo>
    And input additional info
    Then validasi input form ca informasi lainnya "<status>"
    Examples:
      | companyOwner | companyInfo | status              |
      | 0            | 1           | company owner empty |
      | 2            | 1           | owner name empty    |
      | 1            | 0           | company info empty  |
      | 1            | 1           | success             |

  Scenario: Submit data CA
  When click button submit
  Then validasi submit form client assessment

#    Scenario: Signature
#      When open web employee
#      And login to system
#      And click menu signature
#      And create signature
