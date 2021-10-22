package com.zhongger.zchat.mapper;

import com.zhongger.zchat.DTO.ContactPersonDelete;
import com.zhongger.zchat.entity.Contactperson;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactPersonMapper {
    Integer insert(Contactperson contactperson);
    Integer deleteforuserid(String username);
    Integer delete (ContactPersonDelete contactPersonDelete);
    Contactperson select(ContactPersonDelete contactPersonDelete);
}
