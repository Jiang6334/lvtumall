package com.future.lvtumall.member;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @RunWith(SpringRunner.class)
// @SpringBootTest
public class LvtumallMemberApplicationTests {

    @Test
    public void contextLoads() {

        String s = DigestUtils.md5Hex("Wj990827.");
        System.out.println(s);
        System.out.println(Md5Crypt.md5Crypt("Wj990827.".getBytes()));
        System.out.println(Md5Crypt.md5Crypt("Wj990827.".getBytes(),"$1$qqqqqqqq"));

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        //$2a$10$GT0TjB5YK5Vx77Y.2N7hkuYZtYAjZjMlE6NWGE2Aar/7pk/Rmhf8S
        //$2a$10$cR3lis5HQQsQSSh8/c3L3ujIILXkVYmlw28vLA39xz4mHDN/NBVUi
        String encode = bCryptPasswordEncoder.encode("Wj990827.");
        boolean matches = bCryptPasswordEncoder.matches("Wj990827.", "$2a$10$Ve89DHseTCELfpgckao24eYqx9MytYWXvpE89a6BMjiAxgkyjw/Wq");

        System.out.println(encode+"==>" + matches);

//        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        String encode = bCryptPasswordEncoder.encode("Wj990827.");
//        System.out.println("encode = " + encode);
    }

}
