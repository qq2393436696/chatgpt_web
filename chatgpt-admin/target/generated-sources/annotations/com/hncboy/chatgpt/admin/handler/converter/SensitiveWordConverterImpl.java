package com.hncboy.chatgpt.admin.handler.converter;

import com.hncboy.chatgpt.admin.domain.vo.SensitiveWordVO;
import com.hncboy.chatgpt.base.domain.entity.SensitiveWordDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-28T11:47:23+0000",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 17.0.2 (Oracle Corporation)"
)
public class SensitiveWordConverterImpl implements SensitiveWordConverter {

    @Override
    public List<SensitiveWordVO> entityToVO(List<SensitiveWordDO> sensitiveWordDOList) {
        if ( sensitiveWordDOList == null ) {
            return null;
        }

        List<SensitiveWordVO> list = new ArrayList<SensitiveWordVO>( sensitiveWordDOList.size() );
        for ( SensitiveWordDO sensitiveWordDO : sensitiveWordDOList ) {
            list.add( sensitiveWordDOToSensitiveWordVO( sensitiveWordDO ) );
        }

        return list;
    }

    protected SensitiveWordVO sensitiveWordDOToSensitiveWordVO(SensitiveWordDO sensitiveWordDO) {
        if ( sensitiveWordDO == null ) {
            return null;
        }

        SensitiveWordVO sensitiveWordVO = new SensitiveWordVO();

        sensitiveWordVO.setCreateTime( sensitiveWordDO.getCreateTime() );
        sensitiveWordVO.setId( sensitiveWordDO.getId() );
        sensitiveWordVO.setStatus( sensitiveWordDO.getStatus() );
        sensitiveWordVO.setUpdateTime( sensitiveWordDO.getUpdateTime() );
        sensitiveWordVO.setWord( sensitiveWordDO.getWord() );

        return sensitiveWordVO;
    }
}
