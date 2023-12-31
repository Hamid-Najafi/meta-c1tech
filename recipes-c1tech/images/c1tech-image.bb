require recipes-core/images/core-image-minimal.bb 

IMAGE_INSTALL += "libstdc++ mtd-utils" 
IMAGE_INSTALL += "openssh openssl openssh-sftp-server" 
IMAGE_INSTALL += "python3"

IMAGE_FEATURES +="eclipse-debug tools-sdk dev-pkgs debug-tweaks package-management"

# EXTRA_IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL += " \
cronie \
nano \
vim \
bash \
i2c-tools \
rsync \
avahi-daemon \
${Qt_UTILS} \
${TOUCHSCREEN_UTILS} \
"
# gstreamer \

TOUCHSCREEN_UTILS = " \
tslib-conf \
tslib-tests \
tslib-calibrate \
tslib \
"

Qt_UTILS= " \
qtbase \
qtbase-tools \
qtdeclarative \
qtserialport \
qtcharts \
qtcharts-dev \
liberation-fonts \
qtquickcontrols \
qtquickcontrols2 \
qtquickcontrols-qmlplugins \
qtgraphicaleffects-qmlplugins \
qtdeclarative-qmlplugins \
"
PACKAGECONFIG_FONTS:append:pn-qtbase = " fontconfig"

PACKAGECONFIG_DISTRO:pn-qtbase ="linuxfb"

PACKAGECONFIG:append = " gif"