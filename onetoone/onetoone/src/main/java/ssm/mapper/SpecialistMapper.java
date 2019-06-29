package ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ssm.pojo.Specialist;
import ssm.pojo.SpecialistExample;

public interface SpecialistMapper {
    int countByExample(SpecialistExample example);

    int deleteByExample(SpecialistExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Specialist record);

    int insertSelective(Specialist record);

    List<Specialist> selectByExample(SpecialistExample example);

    Specialist selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Specialist record, @Param("example") SpecialistExample example);

    int updateByExample(@Param("record") Specialist record, @Param("example") SpecialistExample example);

    int updateByPrimaryKeySelective(Specialist record);

    int updateByPrimaryKey(Specialist record);
}