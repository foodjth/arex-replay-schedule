package com.arextest.schedule.model.config;

import java.util.List;
import lombok.Data;

/**
 * Created by rchen9 on 2022/9/20.
 */
@Deprecated
@Data
public class CompareReferenceConfig extends AbstractCompareDetailConfig {

  private List<String> pkPath;

  private List<String> fkPath;

}