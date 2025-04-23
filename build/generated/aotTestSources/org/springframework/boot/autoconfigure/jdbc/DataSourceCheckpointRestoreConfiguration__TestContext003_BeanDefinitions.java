package org.springframework.boot.autoconfigure.jdbc;

import javax.sql.DataSource;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.jdbc.HikariCheckpointRestoreLifecycle;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Bean definitions for {@link DataSourceCheckpointRestoreConfiguration}.
 */
@Generated
public class DataSourceCheckpointRestoreConfiguration__TestContext003_BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceCheckpointRestoreConfiguration'.
   */
  public static BeanDefinition getDataSourceCheckpointRestoreConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceCheckpointRestoreConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSourceCheckpointRestoreConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link DataSourceCheckpointRestoreConfiguration.Hikari}.
   */
  @Generated
  public static class Hikari {
    /**
     * Get the bean definition for 'hikari'.
     */
    public static BeanDefinition getHikariBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceCheckpointRestoreConfiguration.Hikari.class);
      beanDefinition.setInstanceSupplier(DataSourceCheckpointRestoreConfiguration.Hikari::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'hikariCheckpointRestoreLifecycle'.
     */
    private static BeanInstanceSupplier<HikariCheckpointRestoreLifecycle> getHikariCheckpointRestoreLifecycleInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<HikariCheckpointRestoreLifecycle>forFactoryMethod(DataSourceCheckpointRestoreConfiguration.Hikari.class, "hikariCheckpointRestoreLifecycle", DataSource.class, ConfigurableApplicationContext.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.autoconfigure.jdbc.DataSourceCheckpointRestoreConfiguration$Hikari", DataSourceCheckpointRestoreConfiguration.Hikari.class).hikariCheckpointRestoreLifecycle(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'hikariCheckpointRestoreLifecycle'.
     */
    public static BeanDefinition getHikariCheckpointRestoreLifecycleBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(HikariCheckpointRestoreLifecycle.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.autoconfigure.jdbc.DataSourceCheckpointRestoreConfiguration$Hikari");
      beanDefinition.setInstanceSupplier(getHikariCheckpointRestoreLifecycleInstanceSupplier());
      return beanDefinition;
    }
  }
}
