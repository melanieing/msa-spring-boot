package dev.ktcloud.black.common.adapter.configuration;

@org.springframework.context.annotation.Configuration()
@org.springframework.data.jpa.repository.config.EnableJpaAuditing()
@org.springframework.transaction.annotation.EnableTransactionManagement()
@org.springframework.data.jpa.repository.config.EnableJpaRepositories(basePackages = {"dev.ktcloud.black.**.adapter.infrastructure.jpa.repository"})
@org.springframework.boot.autoconfigure.domain.EntityScan(basePackages = {"dev.ktcloud.black.common.domain.entity", "dev.ktcloud.black.**.adapter.infrastructure.jpa.entity"})
@kotlin.Metadata(mv = {2, 3, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Ldev/ktcloud/black/common/adapter/configuration/JpaConfig;", "", "<init>", "()V", "common"})
public class JpaConfig {
    
    public JpaConfig() {
        super();
    }
}