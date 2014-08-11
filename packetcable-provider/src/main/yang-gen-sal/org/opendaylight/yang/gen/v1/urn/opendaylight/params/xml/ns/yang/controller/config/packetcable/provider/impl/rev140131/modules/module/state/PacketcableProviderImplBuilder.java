package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl} instances.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl
 */
public class PacketcableProviderImplBuilder {

    private java.lang.Boolean _connectionState;

    private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>> augmentation = new HashMap<>();

    public PacketcableProviderImplBuilder() {
    } 
    

    public PacketcableProviderImplBuilder(PacketcableProviderImpl base) {
        this._connectionState = base.isConnectionState();
        if (base instanceof PacketcableProviderImplImpl) {
            PacketcableProviderImplImpl _impl = (PacketcableProviderImplImpl) base;
            this.augmentation = new HashMap<>(_impl.augmentation);
        }
    }


    public java.lang.Boolean isConnectionState() {
        return _connectionState;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public PacketcableProviderImplBuilder setConnectionState(java.lang.Boolean value) {
        this._connectionState = value;
        return this;
    }
    
    public PacketcableProviderImplBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl> augmentation) {
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }

    public PacketcableProviderImpl build() {
        return new PacketcableProviderImplImpl(this);
    }

    private static final class PacketcableProviderImplImpl implements PacketcableProviderImpl {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl.class;
        }

        private final java.lang.Boolean _connectionState;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>> augmentation = new HashMap<>();

        private PacketcableProviderImplImpl(PacketcableProviderImplBuilder base) {
            this._connectionState = base.isConnectionState();
                switch (base.augmentation.size()) {
                case 0:
                    this.augmentation = Collections.emptyMap();
                    break;
                    case 1:
                        final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>> e = base.augmentation.entrySet().iterator().next();
                        this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>>, Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>>singletonMap(e.getKey(), e.getValue());       
                    break;
                default :
                    this.augmentation = new HashMap<>(base.augmentation);
                }
        }

        @Override
        public java.lang.Boolean isConnectionState() {
            return _connectionState;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.packetcable.provider.impl.rev140131.modules.module.state.PacketcableProviderImpl>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_connectionState == null) ? 0 : _connectionState.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            PacketcableProviderImplImpl other = (PacketcableProviderImplImpl) obj;
            if (_connectionState == null) {
                if (other._connectionState != null) {
                    return false;
                }
            } else if(!_connectionState.equals(other._connectionState)) {
                return false;
            }
            if (augmentation == null) {
                if (other.augmentation != null) {
                    return false;
                }
            } else if(!augmentation.equals(other.augmentation)) {
                return false;
            }
            return true;
        }
        
        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("PacketcableProviderImpl [");
            boolean first = true;
        
            if (_connectionState != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_connectionState=");
                builder.append(_connectionState);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
